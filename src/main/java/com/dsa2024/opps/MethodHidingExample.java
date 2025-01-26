package com.dsa2024.opps;

class SuperClass {
    // Static method in the superclass
    public static void display() {
        System.out.println("Static method in SuperClass");
    }

    // Non-static method in the superclass
    public void instanceMethod() {
        System.out.println("Instance method in SuperClass");
    }
}

class SubClass extends SuperClass {
    // Static method in the subclass
    public static void display() {
        System.out.println("Static method in SubClass");
    }

    // Non-static method in the subclass
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in SubClass");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SuperClass subClassAsSuper = new SubClass();
        SubClass subClass = new SubClass();

        // Calling static methods
        superClass.display(); // Output: Static method in SuperClass
        subClassAsSuper.display(); // Output: Static method in SuperClass (method hiding)
        subClass.display(); // Output: Static method in SubClass

        // Calling instance methods
        superClass.instanceMethod(); // Output: Instance method in SuperClass
        subClassAsSuper.instanceMethod(); // Output: Instance method in SubClass (method overriding)
        subClass.instanceMethod(); // Output: Instance method in SubClass
    }
}
