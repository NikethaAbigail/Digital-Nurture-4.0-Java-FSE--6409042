package com.employee;

public class EmployeeManager {
    private Employee[] employees;
    private int size; // Current number of employees
    private static final int MAX_SIZE = 100; // Fixed array size

    public EmployeeManager() {
        employees = new Employee[MAX_SIZE];
        size = 0;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        if (size < MAX_SIZE) {
            employees[size++] = employee;
            System.out.println("Employee added: " + employee);
        } else {
            System.out.println("Array is full! Cannot add more employees.");
        }
    }

    // Search for an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Not found
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees to display!");
        } else {
            System.out.println("Employee List:");
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    // Delete an employee by employeeId
    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--size] = null; // Clear the last reference
            System.out.println("Employee deleted with ID: " + employeeId);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found!");
        }
    }
}