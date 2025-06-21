package com.library;

public class Main {
    public static void main(String[] args) {
        
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B004", "Brave New World", "Aldous Huxley")
        };

        
        LibraryManager manager = new LibraryManager(books);

        
        System.out.println("Linear Search for '1984':");
        Book result = manager.linearSearch("1984");
        System.out.println(result != null ? result : "Book not found");



        System.out.println("\nBinary Search for '1984':");
        result = manager.binarySearch("1984");
        System.out.println(result != null ? result : "Book not found");

       
        System.out.println("\nLinear Search for 'Dune':");
        result = manager.linearSearch("Dune");
        System.out.println(result != null ? result : "Book not found");
    }
}