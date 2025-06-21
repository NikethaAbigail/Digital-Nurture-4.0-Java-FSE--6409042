package com.task;

public class Main {
    public static void main(String[] args) {
       
        TaskManager manager = new TaskManager();

      
        manager.addTask(new Task("T001", "Design UI", "In Progress"));
        manager.addTask(new Task("T002", "Write Code", "Pending"));
        manager.addTask(new Task("T003", "Test App", "Completed"));

       
        manager.traverseTasks();

        
        System.out.println("\nSearching for task with ID T002:");
        Task found = manager.searchTask("T002");
        System.out.println(found != null ? found : "Task not found");

        
        manager.deleteTask("T002");

       
        manager.traverseTasks();
    }
}