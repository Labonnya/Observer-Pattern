# Observer

Design and implement a file monitoring system using the Observer Design Pattern in Java.
Create an abstract Subject class that represents a file. The Subject class should include a list of registered observers and methods to register and unregister observers. Additionally, it should include a method to notify the observers of changes in the file.
Implement a ConcreteSubject class that extends the Subject class. This class should monitor a specific file for changes and notify its observers of any changes made to the file.
Create an abstract Observer class that represents a file monitor. The Observer class should include an update method that is called by the subject to notify the observer of a change in the file.
Implement a ConcreteObserver class that extends the Observer class. This class should have a name and a method to display the details of the file change (e.g. the name of the file, the type of change made, the time of the change).
In the main method of your program, create a ConcreteSubject object and register one or more ConcreteObserver objects to it. Then, simulate changes to the file being monitored and verify that the observers are notified of the changes.
Your assignment should include a UML diagram of the Observer Design Pattern implementation (in the report), as well as source code for each of the components described above. Additionally, you should write a brief report explaining the benefits of using the Observer Design Pattern in this application, and any potential drawbacks or limitations. Finally, provide a demonstration of the system in action, showing how it can be used to monitor and track changes in files in real-time.
