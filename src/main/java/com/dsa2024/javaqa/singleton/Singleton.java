package com.dsa2024.javaqa.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // Lazy initialization (only creates the instance when needed)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Sample method in Singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }

    /* Synchronized Method
    * public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
      }*/

    /* Double-Checked Locking (Better performance):
    * public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    */
}

