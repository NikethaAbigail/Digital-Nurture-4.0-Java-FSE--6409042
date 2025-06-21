package com.library;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManager {
    private Book[] books;

    public LibraryManager(Book[] books) {
        this.books = books.clone(); 
    }

    // Linear Search
    public Book linearSearch(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; 
    }

    // Binary Search
    public Book binarySearch(String title) {
        
        Book[] sortedBooks = books.clone();
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        int left = 0;
        int right = sortedBooks.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedBooks[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return sortedBooks[mid]; 
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
}