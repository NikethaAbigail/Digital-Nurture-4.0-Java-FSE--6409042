package com.commerce;

public class Main {
    public static void main(String[] args) {
        
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Phone", "Electronics"),
            new Product("P003", "Shirt", "Clothing"),
            new Product("P004", "Book", "Books")
        };

        
        SearchManager searchManager = new SearchManager(products);

    
        System.out.println("Linear Search for 'Phone':");
        Product result = searchManager.linearSearch("Phone");
        System.out.println(result != null ? result : "Product not found");

      
        System.out.println("\nBinary Search for 'Phone':");
        result = searchManager.binarySearch("Phone");
        System.out.println(result != null ? result : "Product not found");

        System.out.println("\nLinear Search for 'Tablet':");
        result = searchManager.linearSearch("Tablet");
        System.out.println(result != null ? result : "Product not found");
    }
}