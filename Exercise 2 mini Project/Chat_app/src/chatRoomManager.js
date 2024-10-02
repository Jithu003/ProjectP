
class ChatRoomManager {
    constructor() {
        this.rooms = {}; // Store users per room
    }

    addUserToRoom(roomId, username) {
        if (!this.rooms[roomId]) {
            this.rooms[roomId] = [];
        }
        if (!this.rooms[roomId].includes(username)) {
            this.rooms[roomId].push(username);
        }
    }

    removeUserFromRoom(roomId, username) {
        if (this.rooms[roomId]) {
            this.rooms[roomId] = this.rooms[roomId].filter(user => user !== username);
            if (this.rooms[roomId].length === 0) {
                delete this.rooms[roomId];
            }
        }
    }

    getActiveUsers(roomId) {
        return this.rooms[roomId] || [];
    }
}

module.exports = new ChatRoomManager();
