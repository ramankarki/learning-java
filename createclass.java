import java.util.Scanner;

class circle {
  double PI = 3.145;

  double area(double radius) {
    return PI * radius * radius;
  }
}

public class createclass {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Radius: ");
    double radius = input.nextDouble();
    circle circleObj = new circle();
    double area = circleObj.area(radius);
    System.out.println(area);

    input.close();
  }
}
