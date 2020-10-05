import java.util.Scanner;

class enterChar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("string: ");
    String str = input.nextLine();
    System.out.println("entered string: " + str);
    input.close();
  }
}
