import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filerw {
    public static void main(String[] args){
        try {
            File f = new File("A.txt");
            Scanner sc = new Scanner(f);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int g = sc.nextInt();

            int sum1 = 0,sum2 = 0,sum3 =0;
            sum1 =a+b;
            sum2 = c+d;
            sum3 = e+g;
            PrintWriter out = new PrintWriter("B.txt");

            out.println(sum1);
            out.println(sum2);
            out.println(sum3);


            out.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
