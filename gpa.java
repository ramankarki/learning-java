import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("marks: ");
        long marks = input.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("A+ outstanding");
        }
        else if (marks >= 80 && marks < 90) {
            System.out.println("A exellent");
        }
        else if (marks >= 70 && marks < 80) {
            System.out.println("B+ very good");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("B good");
        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("C+ above avg");
        }
        else if (marks >= 40 && marks < 50) {
            System.out.println("C average");
        }
        else if (marks >= 20 && marks < 40) {
            System.out.println("D below avg");
        }
        else if (marks >= 1 && marks < 20) {
            System.out.println("D insufficient");
        }
        else {
            System.out.println("N not graded");         
        }
        input.close();
    }
}
