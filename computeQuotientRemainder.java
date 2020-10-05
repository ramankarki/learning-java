import java.util.Scanner;

public class computeQuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dividend: ");
        long dividend = input.nextInt();
        System.out.print("divisor: ");
        long divisor = input.nextInt();      
        long quotient = dividend / divisor;  
        long remainder = dividend % divisor;
        String output = String.format("\n%d / %d\nquotient: %d\nremainder: %d", dividend, divisor, quotient, remainder);  
        System.out.println(output);
        input.close();
    }
}
