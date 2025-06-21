package com.commerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchManager {
    private Product[] products;

    public SearchManager(Product[] products) {
        this.products = products.clone(); 
    }

    // Linear Search
    public Product linearSearch(String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; 
    }

    // Binary Search
    public Product binarySearch(String productName) {
       
        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedProducts[mid].getProductName().compareToIgnoreCase(productName);

            if (comparison == 0) {
                return sortedProducts[mid]; 
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
}