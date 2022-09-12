package Gauss_Seidal_Method;
import java.util.Scanner;

public class Test {
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        double a1,b1,c1,d1,a2,b2,c2,d2,a3,b3,c3,d3;

        System.out.println("Enter the all input values :");
        a1 = in.nextDouble();
        b1 = in.nextDouble();
        c1 = in.nextDouble();
        d1 = in.nextDouble();
        a2 = in.nextDouble();
        b2 = in.nextDouble();
        c2 = in.nextDouble();
        d2 = in.nextDouble();
        a3 = in.nextDouble();
        b3 = in.nextDouble();
        c3 = in.nextDouble();
        d3 = in.nextDouble();
        double a,b,c;
        System.out.println("Enter the initial value :");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        for(int i=0 ; i<=10; i++)
            {
                a = ((d1 - (b1*b) - (c1 * c))/a1);
                double A = a;
                b = ((d2 - (a2*A) - (c2 * c)) /b2);
                double B = b;
                c = ((d3 - (a3*A) - (b3*B)) / c3);

                System.out.println("a="+a);
                System.out.println("b="+b);
                System.out.println("c="+c);

                System.out.println("========================");
            }


    }
}
