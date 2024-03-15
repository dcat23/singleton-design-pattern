package com.blit;

import java.time.Instant;

public class Singleton {

    private Instant createdAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        createdAt = Instant.now();
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
        System.out.println("Created at " + createdAt);
    }
}
