package com.dsa2024.javaqa.collections;

// Node class
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    private Node head;

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Print the elements of the linked list
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // If the node to delete is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // If the value is not found
        if (current.next == null) {
            System.out.println("Value not found in the list.");
        } else {
            // Delete the node
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing the list
        System.out.println("Linked List:");
        list.printList();

        // Deleting a node
        System.out.println("\nDeleting 20:");
        list.delete(20);
        list.printList();

        // Deleting a node not in the list
        System.out.println("\nDeleting 40:");
        list.delete(40);
        list.printList();
    }
}
