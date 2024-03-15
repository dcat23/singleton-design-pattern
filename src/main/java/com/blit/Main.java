package com.blit;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        try {
            System.out.println("Waiting for 5 seconds");
            Thread.sleep(5000);

            Singleton secondSingleton = Singleton.getInstance();
            secondSingleton.showMessage();

            System.out.println("Created at the same time: " +
                    singleton.getCreatedAt().equals(secondSingleton.getCreatedAt()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}