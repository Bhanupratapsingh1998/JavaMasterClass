package com.dsa2024.multithreading;

class Account1 implements Cloneable {
    int balance;

    public Account1(int balance) {
        this.balance = balance;
    }

    @Override
    protected Account1 clone() throws CloneNotSupportedException {
        return (Account1) super.clone(); // Deep copy of the account object
    }
}

public class WithDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Account1 originalAccount = new Account1(1000);

        // Each thread gets its own deep copy of the account object
        Account1 depositCopy = originalAccount.clone();
        Account1 withdrawCopy = originalAccount.clone();

        // Thread depositThread = new Thread(() -> depositCopy.balance += 500);
        // Thread withdrawThread = new Thread(() -> withdrawCopy.balance -= 300);

         // Thread for depositing money
         Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                depositCopy.balance += 500;
            }
        });

        // Thread for withdrawing money
        Thread withdrawThread = new Thread(new Runnable() {
            @Override
            public void run() {
                withdrawCopy.balance -= 300;
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Processed independently
        System.out.println("Deposit Balance: " + depositCopy.balance); // 1500
        System.out.println("Withdraw Balance: " + withdrawCopy.balance); // 700
        System.out.println("Original Balance Unchanged: " + originalAccount.balance); // 1000
    }
}
