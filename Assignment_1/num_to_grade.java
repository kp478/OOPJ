import java.util.Scanner;

public class num_to_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num: ");
        double num_grade = scanner.nextDouble();

        String letter_grade = num_to_letter_grade(num_grade);

        System.out.println("Your grade is: " + letter_grade);
    }

    public static String num_to_letter_grade(double grade) {
        if (grade >= 90) {
            return "A";
        }
        else if (grade >= 80) {
            return "B";
        }
        else if (grade >= 70) {
            return "C";
        }
        else if (grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }
}