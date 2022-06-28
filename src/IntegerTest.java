import java.util.Scanner;

public class IntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%10;
        int c = a%100;
        System.out.println("Вывести еденицу: " + b );
        System.out.println("Вывести десятки: " + c);


    }
}