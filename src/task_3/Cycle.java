package task_3;
import java.util.Scanner;

public class Cycle {
    public static void main (String [] args){

        System.out.println("Enter parameters:");
        Scanner in=new Scanner(System.in);
        System.out.print("1. The start parameter a=");
        double a=in.nextDouble();
        System.out.print("2. The end parameter b=");
        double b=in.nextDouble();
        System.out.print("3. The log h=");
        double h=in.nextDouble();

        double x, f;

        if (a<b && h>0 && h<b) {
            System.out.println("x \t F");
            for (x=a; x<=b; x += h) {
                f = Math.tan(2 * x) - 3;
                System.out.println(+x +"\t"+f);
            }
        } else {
            System.out.println("Incorrect parameters!");
        }
    }
}





