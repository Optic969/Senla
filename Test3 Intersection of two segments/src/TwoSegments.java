import java.util.Scanner;

import static java.lang.System.*;

public class TwoSegments {


public static void main(String[] args) {

Scanner in = new Scanner(System.in);
boolean isCrossing;

out.println("Введите координаты первого отрезка: " );
out.println("Координата х1: " );
int x1 = in.nextInt();
out.println("Координата у1: " );
int y1 = in.nextInt();
out.println("Координата х2: " );
int x2 = in.nextInt();
out.println("Координата у2: " );
int y2 = in.nextInt();
out.println("Координаты первого отрезка: х1="+x1+" y1="+y1+" x2="+x2+" y2="+y2 );
out.println("Введите координаты второго отрезка: " );
out.println("Координата х3: " );
int x3 = in.nextInt();
out.println("Координата х3: " );
int y3 = in.nextInt();
out.println("Координата х4: " );
int x4 = in.nextInt();
out.println("Координата х4: " );
int y4 = in.nextInt();
out.println("Координаты второго отрезка: х1="+x3+" y1="+y3+" x2="+x4+" y2="+y4 );


float a1 = 0, a2 = 0, b1 = 0, b2 = 0, d = 0, c1 = 0, c2 = 0, xi = 0, yi = 0;
a1 = y1 - y2; b1 = x2 - x1;
a2 = y3 - y4; b2 = x4 - x3;

d = a1 * b2 - a2 * b1;
if ( d != 0 ) { c1 = y2 * x1 - x2 * y1;
c2 = y4 * x3 - x4 * y3;

xi = (b1 * c2 - b2 * c1) / d;
yi = (a2 * c1 - a1 * c2) / d;
    isCrossing = ((x1 <= xi) && (x2 >= xi) && (x3 <= xi) && (x4 >= xi)) || ((y1 <= yi) && (y2 >= yi) && (y3 <= yi) && (y4 >= yi));
}
else {isCrossing = false;}
if (isCrossing) {
out.println("Точка пересечения двух отрезков (" + xi + "," + yi + ")");}
else {
out.println("Отрезки не пересекаются");}





}
}