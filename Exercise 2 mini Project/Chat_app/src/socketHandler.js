// src/socketHandler.js
const ChatRoomManager = require('./chatRoomManager'); // Import chat room manager

const messageHistory = {}; // To store message history for each room

function handleSocketConnection(io, socket) {
    console.log('A user connected');

    socket.on('joinRoom', (roomId, username) => {
        socket.join(roomId);
        ChatRoomManager.addUserToRoom(roomId, username);
        io.to(roomId).emit('activeUsers', ChatRoomManager.getActiveUsers(roomId));

        // Send message history to the user
        if (messageHistory[roomId]) {
            messageHistory[roomId].forEach(msg => {
                socket.emit('receiveMessage', msg);
            });
        }

        console.log(`${username} joined room: ${roomId}`);
    });

    socket.on('sendMessage', (roomId, message, username) => {
        if (!messageHistory[roomId]) messageHistory[roomId] = [];
        messageHistory[roomId].push({ username, message }); // Save message to history

        io.to(roomId).emit('receiveMessage', { username, message });
        console.log(`${username}: ${message}`);
    });

    socket.on('privateMessage', (toUsername, message, fromUsername) => {
        const targetSocketId = [...io.sockets.sockets].find(([id, socket]) => {
            return socket.username === toUsername;
        })[0];

        if (targetSocketId) {
            io.to(targetSocketId).emit('receivePrivateMessage', { fromUsername, message });
        }
    });

    socket.on('disconnect', () => {
        console.log('A user disconnected');
    });
}

module.exports = { handleSocketConnection };
