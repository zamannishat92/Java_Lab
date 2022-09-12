package OsOnline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Processes-");
        int num = sc.nextInt();
        String name;
        int d = 0;
        int a = 0;
        Process[] P = new Process[num];
        for (int i = 0; i < num; i++) {
            name = sc.next();
            d = sc.nextInt();
            a = sc.nextInt();
            P[i] = new Process(name, d, a);

        }
        Arrays.sort(P, new Process.DurSort());
        Arrays.sort(P, new Process.ArrSort());
        for(int i=0;i<P.length;i++){
            System.out.println(P[i].ProName+" "+P[i].duration+" "+P[i].arrtime);
        }

    }
}



