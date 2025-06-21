package com.customer;

public class SortManager {
    private Order[] orders;

    public SortManager(Order[] orders) {
        this.orders = orders.clone(); // Create a copy to preserve original array
    }

    // Bubble Sort
    public Order[] bubbleSort() {
        Order[] arr = orders.clone();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
                    // Swap elements
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Quick Sort
    public Order[] quickSort() {
        Order[] arr = orders.clone();
        quickSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSortHelper(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partition index
            quickSortHelper(arr, low, pi - 1);  // Sort left part
            quickSortHelper(arr, pi + 1, high); // Sort right part
        }
    }

    private int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].getTotalPrice() <= pivot) {
                i++;
                
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}