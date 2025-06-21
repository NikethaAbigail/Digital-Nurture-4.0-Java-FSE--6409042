package com.customer;

public class Main {
    public static void main(String[] args) {
        
        Order[] orders = {
            new Order("O001", "Alice", 150.50),
            new Order("O002", "Bob", 75.25),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 50.75)
        };

        
        SortManager sortManager = new SortManager(orders);

        
        Order[] bubbleSorted = sortManager.bubbleSort();
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSorted) {
            System.out.println(order);
        }

        Order[] quickSorted = sortManager.quickSort();
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSorted) {
            System.out.println(order);
        }
    }
}