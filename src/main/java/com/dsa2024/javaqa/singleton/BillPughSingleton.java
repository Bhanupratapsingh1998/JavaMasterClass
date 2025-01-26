package com.dsa2024.javaqa.singleton;

public class BillPughSingleton {

    // Singleton class
    static class Singleton {
        // Private constructor to prevent instantiation
        private Singleton() {
            System.out.println("Singleton instance created.");
        }

        // Static inner class - SingletonHelper
        private static class SingletonHelper {
            // Instance of Singleton created lazily
            private static final Singleton INSTANCE = new Singleton();
        }

        // Public method to provide access to the Singleton instance
        public static Singleton getInstance() {
            return SingletonHelper.INSTANCE;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Bill Pugh Singleton Example ===");

        // Access Singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
