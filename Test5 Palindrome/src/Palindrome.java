import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(" Введите слово :");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        isPalindrome(s);
    }

    private static String reverseString(String s) {
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i)
            r.append(s.charAt(i));
        return r.toString();


    }

    private static void isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println(" Слово является Полиндромом");
        } else {
            System.out.println("Слово неявляется полиндром");
        }
        reverseString(s);

    }
}