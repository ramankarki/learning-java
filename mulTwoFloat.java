import java.util.*;

public class mulTwoFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("first number: ");
        double num1 = input.nextFloat();
        System.out.print("second number: ");
        double num2 = input.nextFloat();
        double mul = num1 * num2 ;
        System.out.print("mul: " + mul + "\n");
        input.close();
    }
}
