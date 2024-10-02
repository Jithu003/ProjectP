Project

Design Patterns Exercise 1

This repository showcases implementations of various software design patterns, demonstrating both Behavioral, Creational, and Structural patterns through practical use cases.
Repository Structure
Behavioral Design Patterns
A. Environmental Monitoring System (Observer Pattern)

    Pattern: Observer
    Use Case: This system continuously monitors environmental parameters like temperature using different sensors. Mobile devices act as observers, receiving real-time updates on environmental changes.
    Files: MobileDisplay.java, MonitoringSystem.java, Observer.java, Sensor.java, TemperatureSensor.java

B. Home Automation (Command Pattern)

    Pattern: Command
    Use Case: A home automation system where commands (e.g., turning lights on/off) are encapsulated into objects to provide flexible control over devices using a remote.
    Files: Command.java, Light.java, RemoteControl.java, TurnOnLightCommand.java, TurnOffLightCommand.java

Creational Design Patterns
A. Shape Factory (Factory Pattern)

    Pattern: Factory
    Use Case: A shape-drawing application that uses a factory to generate different shapes (e.g., Circle, Rectangle), decoupling the shape creation logic from client code.
    Files: Shape.java, Circle.java, Rectangle.java, ShapeFactory.java, FactoryPatternDemo.java

B. Logger (Singleton Pattern)

    Pattern: Singleton
    Use Case: A logging system ensuring that only one instance of the logger exists globally throughout the application.
    Files: Logger.java, SingletonPatternDemo.java

Structural Design Patterns
A. Voltage Adapter System (Adapter Pattern)

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

git clone https://github.com/<YourUsername>/Design_Patterns_Exercise_1.git

Navigate to any design pattern's directory (e.g., Behavioural/Environmental_Monitoring_System):

bash

cd Design_Patterns_Exercise_1/Behavioural/Environmental_Monitoring_System

Compile and run the Java files:

bash

    javac *.java
    java <MainClassName>

About

This project implements six design patterns: two Behavioral, two Creational, and two Structural patterns. It provides real-world use cases to demonstrate practical applications of each design pattern.
