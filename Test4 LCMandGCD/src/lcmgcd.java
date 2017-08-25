import java.util.Scanner;


public class lcmgcd {
    public static void main(String args[])
    {
        System.out.print("Введите число а: ");
        Scanner input = new Scanner(System.in);
        int fi = input.nextInt();
        System.out.print("Введите число b: ");
        int si = input.nextInt();
        System.out.println( "НОД чисел a,b: " + NOD(fi,si)+" "+" НОK чисел a,b: " +NOK(fi,si));
    }
    private static int NOD(int fi, int si)
    {
        int min;
        int nod = 0;
        if(fi > si)
            min = si;
        else
            min = fi;
        for(int count = 1;count <= min;count++)
        {
            if(fi % count == 0 && si % count == 0){
                if(count>nod)
                    nod = count;
            }
        }
        return nod;
    }
    private static int NOK(int fi, int si)
    {
        int nok = 0;
        int count = 1;
        while(nok == 0)
        {
            if(count % fi == 0 && count % si == 0)
                nok = count;
            count++;
        }
        return nok;
    }
}