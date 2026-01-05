package logicBuildingUsingJava;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store marks for 5 subjects
        int[] marks = new int[5];
        
        // Enter marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate total marks
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        
        // Calculate average
        double average = total / 5.0;
        
        // Display total and average
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);
        
        // Determine and display grade
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 60) {
            grade = "First Class";
        } else if (average >= 40) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}