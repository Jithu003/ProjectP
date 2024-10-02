Design Patterns Exercise 1

This repository showcases implementations of various software design patterns, demonstrating both Behavioral, Creational, and Structural patterns through practical use cases. Repository Structure Behavioral Design Patterns A. Environmental Monitoring System (Observer Pattern)

Pattern: Observer
Use Case: This system continuously monitors environmental parameters like temperature using different sensors. Mobile devices act as observers, receiving real-time updates on environmental changes.
Files: MobileDisplay.java, MonitoringSystem.java, Observer.java, Sensor.java, TemperatureSensor.java

B. Home Automation (Command Pattern)

Pattern: Command
Use Case: A home automation system where commands (e.g., turning lights on/off) are encapsulated into objects to provide flexible control over devices using a remote.
Files: Command.java, Light.java, RemoteControl.java, TurnOnLightCommand.java, TurnOffLightCommand.java

Creational Design Patterns A. Shape Factory (Factory Pattern)

Pattern: Factory
Use Case: A shape-drawing application that uses a factory to generate different shapes (e.g., Circle, Rectangle), decoupling the shape creation logic from client code.
Files: Shape.java, Circle.java, Rectangle.java, ShapeFactory.java, FactoryPatternDemo.java

B. Logger (Singleton Pattern)

Pattern: Singleton
Use Case: A logging system ensuring that only one instance of the logger exists globally throughout the application.
Files: Logger.java, SingletonPatternDemo.java

Structural Design Patterns A. Voltage Adapter System (Adapter Pattern)

Pattern: Adapter
Use Case: A system that adapts 220V voltage to 110V using an adapter, demonstrating how incompatible interfaces can be integrated using the Adapter pattern.
Files: Voltage110V.java, Voltage220V.java, VoltageAdapter.java, AdapterPatternDemo.java

B. Coffee Shop System (Decorator Pattern)

Pattern: Decorator
Use Case: A coffee customization system that allows dynamic addition of ingredients (e.g., milk, sugar) by decorating a base coffee object.
Files: Coffee.java, BasicCoffee.java, CoffeeDecorator.java, MilkDecorator.java, SugarDecorator.java, DecoratorPatternDemo.java

How to Run the Code

Clone the repository:

bash

git clone https://github.com//Design_Patterns_Exercise_1.git

Navigate to any design pattern's directory (e.g., Behavioural/Environmental_Monitoring_System):

bash

cd Design_Patterns_Exercise_1/Behavioural/Environmental_Monitoring_System

Compile and run the Java files:

bash

javac *.java
java <MainClassName>

About

This project implements six design patterns: two Behavioral, two Creational, and two Structural patterns. It provides real-world use cases to demonstrate practical applications of each design pattern.

Real-Time Chat Application

This project is a simple real-time chat application that allows users to join or create chat rooms and exchange messages in real time. The application demonstrates various design patterns such as Observer, Singleton, and Adapter to ensure modularity and scalability.
Features

    Create/Join Chat Rooms: Users can create chat rooms or join existing ones by entering a unique room ID.
    Real-Time Messaging: All messages are transmitted in real-time, ensuring instant communication within the chat room.
    Active Users List: Displays a list of users who are currently active in the chat room.
    Private Messaging (Optional): Users can send private messages to other participants.
    Message History: Users can view the chat history when they join a room, even if they weren't present when the previous messages were sent.

Key Design Patterns

    Observer Pattern: Used to notify clients of new messages and user activities.
    Singleton Pattern: Manages the state of the chat rooms and ensures there is only one instance of a chat room manager.
    Adapter Pattern: Facilitates communication through different protocols (e.g., WebSocket, HTTP).

Technologies Used

    Node.js: Backend server to handle socket connections and routes.
    Socket.io: For real-time, bidirectional communication between the server and the clients.
    Express.js: To serve the front-end and manage routes.
    HTML/CSS/JavaScript: Front-end technologies to create the chat interface.

How to Run the Project

    Clone the repository:

    bash

git clone <repository-url>
cd chat-app

Install dependencies:

bash

npm install

Start the server:

bash

    node src/server.js

    Open index.html in your browser to start using the chat application.

Folder Structure

bash

/chat-app

├── /src
    ├── server.js
    ├── chatRoomManager.js
    ├── socketHandler.js
    └── routes.js


Future Improvements

    User authentication and authorization.
    File sharing within chat rooms.
    Enhanced private messaging with encryption.
