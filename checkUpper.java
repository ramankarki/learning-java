import java.util.Scanner;;

public class checkUpper {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter string: ");
    String value = input.next();

    for (int i = 0; i < value.length(); i++) {
      char character = value.charAt(i);
      if (character >= 'a' && character <= 'z') {
        System.out.println(character + " is in lower case");
      } else if (character >= 'A' && character <= 'Z') {
        System.out.println(character + " is in upper case");
      } else {
        System.out.println(character + " is not an alphabet");
      }
    }

    input.close();
  }
}
