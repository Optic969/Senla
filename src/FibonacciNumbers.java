import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N ");
        int g = in.nextInt();
        System.out.println("Числа Фибоначчи в диапазоне от 1 до N ");
        int a = 1, b = 1;
        System.out.print(a);
        int summa = 1;
        while (summa < g) {
            System.out.print(" " + summa);
            summa = a + b;
            a = b;
            b = summa;


        }
    }
}