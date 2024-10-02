// src/routes.js
module.exports = function (app) {
    app.get('/status', (req, res) => {
        res.json({ status: 'Server is running' });
    });

    // Add other routes if needed
};
