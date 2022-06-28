import java.util.Scanner;

public class Xom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
       int numberOfTens = x/10;
       int numberOfUnits = x%10;





        System.out.println(numberOfTens+numberOfUnits);
    }
}
