import java.util.Scanner;

public class lightOnOff {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("light: ");
    String value = input.nextLine();
    switch (value) {
      case "on":
        System.out.println("light turned on");
        break;
      case "off":
        System.out.println("light turned off");
        break;
      default:
        System.out.println("wrong input");
    }

    input.close();
  }
}
