import java.util.Scanner;

public class check {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("num: ");
    int num = input.nextInt();
    if (num > 0) {
      System.out.print("it is a positive number");
    } else if (num < 0) {
      System.out.print("it is a negative number");
    } else {
      System.out.print("it is zero");
    }
    input.close();
  }
}
