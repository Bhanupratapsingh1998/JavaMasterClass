package com.dsa2024.leetcode.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(34);
        System.out.println(node1.data + " -> " + node1.next);

        Node node2 = new Node(45);
        node1.next = node2;
        System.out.println(node2.data + " -> " + node2.next);
        System.out.println(node1.data + " -> " + node1.next.data);

        Node node3 = new Node(55);
        node2.next = node3;
        System.out.println(node3.data + " -> " + node3.next);
        System.out.println(node2.data + " -> " + node2.next.data);

    }
}
