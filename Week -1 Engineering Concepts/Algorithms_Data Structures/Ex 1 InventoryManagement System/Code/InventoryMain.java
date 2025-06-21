package com.inventory;

public class InventoryMain {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        
        manager.addProduct(new Product("P001", "Laptop", 10, 999.99));
        manager.addProduct(new Product("P002", "Phone", 20, 499.99));
        manager.addProduct(new Product("P001", "Tablet", 5, 299.99)); 

        
        manager.displayInventory();

        
        manager.updateProduct("P001", "Gaming Laptop", 15, 1299.99);

        
        manager.displayInventory();

       
        manager.deleteProduct("P002");


        manager.displayInventory();
    }
}