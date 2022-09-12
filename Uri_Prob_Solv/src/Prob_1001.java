import java.util.Scanner;

public class Prob_1001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double B = (3.14159 * R*R);
        System.out.format("B=%.4f",B);

        System.out.println("A="+B);
    }
}
