import java.util.Scanner;

public class swapInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        long num1 = input.nextInt();
        System.out.print("b: ");
        long num2 = input.nextInt();
        long temp = num1;
        num1 = num2;
        num2 = temp;
        String output = String.format("\na: %d, b: %d", num1, num2);
        System.out.println(output);
        input.close();
    }
}
