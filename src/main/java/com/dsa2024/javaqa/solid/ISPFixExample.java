package com.dsa2024.javaqa.solid;

// Split interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// Manager only implements what it needs
class Manager1 implements Workable {
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}

// Worker implements both interfaces
class Worker1 implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Worker is eating");
    }
}

public class ISPFixExample {
    public static void main(String[] args) {
        System.out.println("=== Fixing ISP ===");

        Workable manager = new Manager1();
        manager.work();

        Worker1 worker = new Worker1();
        worker.work();
        worker.eat();
    }
}

