package task_2;

public class Sequence {

    public static void main(String[] args) {

        double a, epsilon = 1E-6;

        for (int i = 1; ; i++) {

           int base=i+1, power=2;
           a = 1 / Math.pow(base, power);

            if (a < epsilon) {
                System.out.println("for condition (a < epsilon), a=" + a + ", " + "i=" + i);
                break;
            }

            System.out.println("a("+i+")="+a);
        }
    }
}







