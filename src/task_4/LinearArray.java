package task_4;
import java.util.Scanner;

public class LinearArray {
    public static void main(String[] args) {

        System.out.print("Enter the number of elements in the array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] linearArray = new int[n];
        int maximum=linearArray[0] + linearArray[n-1];
        int i, j = n;

        if (n % 2 == 0) {

            for (i = 0; i < linearArray.length; i++) {
                linearArray[i] = (int) (Math.random() * n);
                System.out.println("a(" + i + ")=" + linearArray[i]);
            }

            for (i=1, j=n-1; i<linearArray.length; i++, j--) {

                if (maximum <= linearArray[i] + linearArray[j - 1]) {
                    maximum = linearArray[i] + linearArray[j - 1];
                }
            } System.out.println("Max sum is "+maximum);

        } else System.out.println("Incorrect array size!");
    }
}





