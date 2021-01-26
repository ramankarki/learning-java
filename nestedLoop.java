import java.util.Scanner;

public class nestedLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter string: ");
    String value = input.next();

    for (int i = value.length() - 1; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print(value.charAt(j));
      }
      System.out.println();
    }

    input.close();
  }
}
