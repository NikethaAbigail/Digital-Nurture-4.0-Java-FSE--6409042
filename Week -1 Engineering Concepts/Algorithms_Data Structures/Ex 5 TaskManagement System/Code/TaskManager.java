package com.task;

public class TaskManager {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public TaskManager() {
        head = null;
        size = 0;
    }

    
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        System.out.println("Task added: " + task);
    }

   
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; 
    }

    
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks to display!");
        } else {
            System.out.println("Task List:");
            Node current = head;
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }
    }

    
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("No tasks to delete!");
            return;
        }
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            size--;
            System.out.println("Task deleted with ID: " + taskId);
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
            System.out.println("Task deleted with ID: " + taskId);
        } else {
            System.out.println("Task with ID " + taskId + " not found!");
        }
    }
}