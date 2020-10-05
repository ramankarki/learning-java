import java.util.*;

public class askNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        long num = input.nextInt();
        System.out.print("Entered number: " + num + "\n");
        input.close();
    }
}
