// src/server.js
const express = require('express');
const http = require('http');
const socketIo = require('socket.io');
const { handleSocketConnection } = require('./socketHandler'); // Import socket event handling
const setupRoutes = require('./routes'); // Import routes

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

// Serve static files (for the HTML, CSS, JS)
app.use(express.static('public'));

// Setup routes
setupRoutes(app);

// WebSocket connection handling
io.on('connection', (socket) => {
    handleSocketConnection(io, socket);
});

const PORT = process.env.PORT || 3000;
server.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
