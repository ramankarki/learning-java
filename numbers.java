public class numbers {
  public static void main(String[] args) {
    // for loop
    // for (int i = 5; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // while loop
    // int i = 5;
    // while (i >= 1) {
    // int j = 1;
    // while (j <= i) {
    // System.out.print(j);
    // j++;
    // }
    // i--;
    // System.out.println();
    // }

    // do while loop
    int i = 5;
    do {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
      i--;
    } while (i >= 1);
  }
}
