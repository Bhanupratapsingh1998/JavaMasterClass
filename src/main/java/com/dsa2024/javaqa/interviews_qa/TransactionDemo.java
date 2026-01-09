package com.dsa2024.javaqa.interviews_qa;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionDemo {

    public static void main(String[] args) {

        List<Transaction> trans = new ArrayList<>();

        trans.add(new Transaction(1, 500.0, "Success"));
        trans.add(new Transaction(2, 200.0, "Pending"));
        trans.add(new Transaction(3, 300.0, "Success"));
        trans.add(new Transaction(4, 150.0, "Fail"));
        trans.add(new Transaction(5, 100.0, "Pending"));
        trans.add(new Transaction(6, 700.0, "Success"));

        // 1️⃣ Group transactions by status
        Map<String, List<Transaction>> groupedByStatus =
                trans.stream()
                     .collect(Collectors.groupingBy(Transaction::getStatus));

        System.out.println("Grouped Transactions:");
        groupedByStatus.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 2️⃣ Count transactions by status
        Map<String, Long> countByStatus =
                trans.stream()
                     .collect(Collectors.groupingBy(
                             Transaction::getStatus,
                             Collectors.counting()
                     ));

        System.out.println("\nCount By Status:");
        System.out.println(countByStatus);

        // 3️⃣ Total amount by status
        Map<String, Double> totalAmountByStatus =
                trans.stream()
                     .collect(Collectors.groupingBy(
                             Transaction::getStatus,
                             Collectors.summingDouble(Transaction::getAmount)
                     ));

        System.out.println("\nTotal Amount By Status:");
        System.out.println(totalAmountByStatus);
    }
}

// ---------------- Transaction Class ----------------
class Transaction {

    private int id;
    private double amount;
    private String status; // Pending, Success, Fail

    public Transaction(int id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", amount=" + amount + ", status='" + status + "'}";
    }
}

