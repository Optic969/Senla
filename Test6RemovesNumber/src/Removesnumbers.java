import java.util.Scanner;

public class Removesnumbers {

    public static void main(String[] args) {
        Scanner scany = new Scanner(System.in);
        System.out.println("Введите текст из которого будут удалены цифры :");
        String inS = scany.next();
        go(inS);
    }

    private static void go(String inS) {
        inS = inS.replaceAll("[0-9]","");
        System.out.println(inS);
    }
}

