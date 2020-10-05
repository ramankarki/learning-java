import java.util.Scanner;

public class testSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("tea or coffee: ");
        String order = input.nextLine();
        switch (order) {
            case "tea":
                System.out.println("Here you have your tea sir.");
                break;
            case "coffee":
                System.out.println("Here you have your coffee sir.");
                break;
            default:
                System.out.println("Sorry sir, We don't have this item.");
        }
        input.close();
    }
}
