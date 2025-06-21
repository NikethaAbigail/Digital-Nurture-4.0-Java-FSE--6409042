package mvc;

public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("John Doe", "S001", "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        System.out.println("Initial Student Details:");
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B+");

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        controller.updateView();
    }
}