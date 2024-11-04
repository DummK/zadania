import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz liczbe: ");
        double number = sc.nextDouble();

        int numbers = (int)(Math.floor(number));
        System.out.println(numbers);

    }
}