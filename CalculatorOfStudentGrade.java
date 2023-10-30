import java.util.Scanner;

public class CalculatorOfStudentGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int Subjects = scanner.nextInt();

        int totalScore = 0;

        for (int i = 1; i <= Subjects; i++) {
            System.out.print("Enter marks (out of 100) for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalScore += marks;
        }

        double averagePercentage = (double) totalScore / (Subjects * 100) * 100;

        System.out.println("Total Marks: " + totalScore);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
            System.out.println("Grade: " + grade);
            System.out.println("Result Is Pass...");
        } 
        else if (averagePercentage >= 80) {
            grade = 'B';
            System.out.println("Grade: " + grade);
            System.out.println("Result Is Pass...");
        }
        else if (averagePercentage >= 70) {
            grade = 'C';
            System.out.println("Grade: " + grade);
            System.out.println("Result Is Pass...");
        }
        else if (averagePercentage >= 60) {
            grade = 'D';
            System.out.println("Grade: " + grade);
            System.out.println("Result Is Pass...");
        }
        else {
            grade = 'F';
            System.out.println("Grade: " + grade);
            System.out.println("Result Is Fail...");
        }

        scanner.close();
    }
}
