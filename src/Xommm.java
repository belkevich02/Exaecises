import java.util.Scanner;

public class Xommm {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                int n = scanner.nextInt();
                int x = 0;
                while (n > 0) {
                    if (n % 10 % 2 == 0) {
                        x++;
                    }
                    n /= 10;
                }
                System.out.println(x);
            }
        }
    }

