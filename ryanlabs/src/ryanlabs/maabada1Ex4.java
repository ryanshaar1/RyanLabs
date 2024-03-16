package ryanlabs;
import java.util.Scanner;

public class maabada1Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLectures = 20;
        int totalStudents = 0;

        for (int i = 1; i <= totalLectures; i++) {
            System.out.print("Enter the number of students for Lecture " + i + ": ");
            int studentsInLecture = scanner.nextInt();
            int salaryForLecture = calculateSalary(studentsInLecture);
            
            totalStudents += studentsInLecture;

            System.out.println("Salary for Lecture " + i + ": " + salaryForLecture);
        }

       
        double averageSalary = (double) totalStudents / totalLectures;
        System.out.println("Average salary per lecture: " + averageSalary);
    }

    public static int calculateSalary(int studentsInLecture) {
        int baseSalary = 180;
        int additionalSalary = (studentsInLecture - 10) * 5;
        
        return Math.max(baseSalary, baseSalary + additionalSalary);
    }
}