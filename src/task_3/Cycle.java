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

        double x, F;
        x=a;

        if (a<b) {
            System.out.println("x"+"           "+"F");
            while (x<=b) {
                F = Math.tan(2 * x) - 3;
                System.out.println(+x + "       " +F);
                x = x + h;
            }
        } else System.out.println("Incorrect parameters: a > b");
    }
}




