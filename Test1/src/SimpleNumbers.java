import java.util.Scanner;

public class SimpleNumbers {


    public static void main(String[] args) {
        countSimpleNumber();
    }


    private static void countSimpleNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число  N: ");
        int n = in.nextInt();
        System.out.println("Простые числа от 1 до " + n);
        int num, arg;
        for (num = 2; num <= n; num++) {
            arg = 2;
            while ((num % arg) > 0) {
                arg++;
            }
            if (arg == num) System.out.print(num + "\t");
        }

    }
}