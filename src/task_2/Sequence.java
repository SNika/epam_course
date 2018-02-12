package task_2;

public class Sequence {

    public static void main(String[] args) {

        double a=0.25, epsilon = 1E-6;
        int i=1;

        while (a>=epsilon){
            int base=i+1, power=2;
            a = 1 / Math.pow(base, power);
            System.out.println("a("+i+")="+a);
            i++;
        }
        System.out.println("for condition (a < epsilon), a=" + a + ", " + "i=" + (i-1));

        /*for (int i = 1; ; i++) {

           int base=i+1, power=2;
           a = 1 / Math.pow(base, power);

            if (a < epsilon) {
                System.out.println("for condition (a < epsilon), a=" + a + ", " + "i=" + i);
                break;
            }

            System.out.println("a("+i+")="+a);
        }*/
    }
}







