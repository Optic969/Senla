import java.util.Scanner;



public class Remnumbs {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст из которого будут удалены цифры:  ");
        String s = in.nextLine();StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {

                r.append(c);
            }
        }
        System.out.println("result: " + r);
    }
}