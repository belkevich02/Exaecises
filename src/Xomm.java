import java.util.Scanner;

public class Xomm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int x1 = x / 10;
        int x2 = x % 10;
        System.out.println(x1-x2);
    }
}
