package com.dsa2024.javaqa.solid;

// General Worker interface (violates ISP)
interface Worker {
    void work();

    void eat();
}

class Manager implements Worker {
    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void eat() {
        System.out.println("Manager is eating (unnecessary)");
    }
}

class GeneralWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Worker is eating");
    }
}

public class ISPViolation {
    public static void main(String[] args) {
        System.out.println("=== Violation of ISP ===");

        Worker manager = new Manager();
        manager.work();
        manager.eat();

        Worker generalWorker = new GeneralWorker();
        generalWorker.work();
        generalWorker.eat();
    }
}

