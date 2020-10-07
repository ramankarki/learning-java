public class isPrime {
    public static void main (String args[]) {
        boolean bool = true;
        System.out.print("Prime number 0-100: ");
        for (int i = 0; i <= 100; i++) {
            if (i >= 2) {
                for (int j = i - 1; j >= 2; j--) {
                    if (i % j == 0) {
                        bool = false;
                        break;
                    }
                    else {
                        bool = true;
                    }
                }
                if (bool) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
