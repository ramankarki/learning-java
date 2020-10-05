import java.util.Scanner;

public class smallAmong3Int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("a: ");  
        int a = input.nextInt();  
        System.out.print("b: ");  
        int b = input.nextInt();
        System.out.print("c: ");  
        int c = input.nextInt();  
        if (a < b) {
            if (a < c) System.out.println(a + " is the smallest");
            else System.out.println(c + " is the smallest");
        }
        else {
            if (b < c) System.out.println(b + " is the smallest");
            else System.out.println(c + " is the smallest");
        }
        input.close();
    }
}
