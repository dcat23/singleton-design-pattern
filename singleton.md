# Singleton Design Pattern
The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to that instance. This pattern is useful when you want to restrict instantiation of a class to a single object, which can be shared across different parts of your application.

## Key Features of Singleton Pattern
- *Single Instance*: The class should have only one instance which is shared across the application.
- Global Access: The instance should be globally accessible so that any part of the application can use it.
## Implementation in Java
Here's a simple implementation of the Singleton Pattern in Java:

```java
public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Creates the instance when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance!");
    }
}
```
## Advantages of Singleton Pattern
- Controlled Access: It provides a global point of access to the instance, allowing controlled access to the object.
- Memory Conservation: It conserves memory by creating the instance only when it is needed (lazy initialization).
- Global Access: It allows the same instance to be accessed from any part of the application.