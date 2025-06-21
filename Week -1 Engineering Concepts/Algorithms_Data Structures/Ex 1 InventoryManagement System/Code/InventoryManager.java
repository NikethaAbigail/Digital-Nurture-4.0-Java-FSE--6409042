package com.inventory;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

  
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID " + product.getProductId() + " already exists!");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added: " + product);
        }
    }


    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product ID " + productId + " not found!");
        }
    }

   
    public void deleteProduct(String productId) {
        Product removedProduct = inventory.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product ID " + productId + " not found!");
        }
    }

    
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            System.out.println("Current Inventory:");
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
}