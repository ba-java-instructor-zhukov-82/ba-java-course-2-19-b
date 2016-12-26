package presentation.patterns.mvc;

public class StudentView {

    public void printStudentDetails(String studentName, int studentGroup) {
        System.out.println("Student:");
        System.out.println("\tName: " + studentName);
        System.out.println("\tGroup: " + studentGroup);
    }
}
