import java.util.Scanner;

public class Vomm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // Вася
        int y = scanner.nextInt(); // Родители
        int z = scanner.nextInt(); // Курс евро
        x = x + y;
        x = x / z;

        System.out.println("Сумма в евро: " + x);

    }
}
