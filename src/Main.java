import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число (a):");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число (b):");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("Сумма a и b: " + (a + b));
        System.out.println("Вычитание a - b: " + (a - b));

        if (b != 0) {
            System.out.println("Деление a на b: " + ((double) a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }

        System.out.println("Умножение a на b: " + (a * b));
    }
}
