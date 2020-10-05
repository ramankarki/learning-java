import java.util.*;

public class addTwoInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("first number: ");
        long num1 = input.nextInt();
        System.out.print("second number: ");
        long num2 = input.nextInt();
        long sum = num1 + num2 ;
        System.out.print("sum: " + sum + "\n");
        input.close();
    }
}
