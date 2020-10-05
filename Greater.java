import java.util.*;

class UserInputDemo   
{
    public static void main(String[] args)  
    {  
        Scanner input = new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter first number- ");  
        int a = input.nextInt();  
        System.out.print("Enter second number- ");  
        int b = input.nextInt();  
        if (a > b) {
            System.out.println(a + " is greater");
        }
        else {
            System.out.println(b + " is greater");
        }
        input.close();
    }  
}
