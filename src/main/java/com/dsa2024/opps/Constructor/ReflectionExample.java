package com.dsa2024.opps.Constructor;

import java.lang.reflect.Constructor;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Get the Class object for the class whose constructor we want to access
            Class<?> clazz = Class.forName("java.util.ArrayList");

            // Get the constructor that takes no arguments
            Constructor<?> constructor = clazz.getConstructor();

            // Create a new instance using the constructor
            Object instance = constructor.newInstance();

            System.out.println("Instance created: " + instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
