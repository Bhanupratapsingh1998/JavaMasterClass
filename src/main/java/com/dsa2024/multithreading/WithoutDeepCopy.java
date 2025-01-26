package com.dsa2024.multithreading;

class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }
}

public class WithoutDeepCopy {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(1000);

        // Two threads sharing the same account object
        Thread depositThread = new Thread(() -> account.balance += 500);
        Thread withdrawThread = new Thread(() -> account.balance -= 300);

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        // Balance might be incorrect due to race conditions 
        System.out.println("Final Balance: " + account.balance); // Output can vary: e.g., 1200, 700
    }
}
