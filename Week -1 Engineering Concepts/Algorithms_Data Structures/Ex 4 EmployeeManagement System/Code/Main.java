package com.employee;

public class Main {
    public static void main(String[] args) {
        
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee("E001", "Alice", "Manager", 75000.00));
        manager.addEmployee(new Employee("E002", "Bob", "Developer", 60000.00));
        manager.addEmployee(new Employee("E003", "Charlie", "Analyst", 55000.00));

       
        manager.traverseEmployees();

       
        System.out.println("\nSearching for employee with ID E002:");
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? found : "Employee not found");

      
        manager.deleteEmployee("E002");

        
        manager.traverseEmployees();
    }
}