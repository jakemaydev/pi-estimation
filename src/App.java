import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        piEstimation();
    }

    public static void piEstimation(){
        Scanner scan = new Scanner(System.in);

        double a = 1;
        double aNext = a;
        double b = 1/Math.sqrt(2);
        double t = 1/4.0;
        int p = 1;

        System.out.println("How many iterations?");
        int iterations = scan.nextInt();

        for(int i = 0; i < iterations; i++){
            aNext = (a+b)/2;
            b = Math.sqrt(a*b);
            t = t - p*Math.pow((a - aNext), 2);
            p = 2*p;
            a = aNext;
        }

        System.out.println((Math.pow(aNext + b, 2)) / (4*t));
    }

    public static BigDecimal piEstimationBigDec(){
        return 0.0;
    }

    public static double piEstimationRecursive(){
        return 0.0;
    }
}

