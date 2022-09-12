import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OsLabAssign_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Process> p=new ArrayList<>();

        int x = 0;
        while (x == 0) {
            System.out.println("1.Continue Process");
            System.out.println("2.Exit");
            System.out.println("---------------------------------");
            System.out.println("Enter the input-");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter the number of Processes-");
                int num = sc.nextInt();
                int global_time = 0;
                int id;
                String name;
                int d;
                int a;
                int sum = 0;

                for (int i = 0; i < num; i++) {
                    id = sc.nextInt();
                    name = sc.next();
                    d = sc.nextInt();
                    a = sc.nextInt();
                    p.add(new Process(id,name,d,a));
                }

                Collections.sort(p);
                System.out.println("Seq.No  ProcessName   TimeLine   Turnaround");
                int count=1;
                for (int i = 0; i < p.size(); i++) {
                    if (global_time >= p.get(i).arrtime) {
                        int start_time = global_time;
                        int end_time = global_time + p.get(i).duration;
                        global_time = end_time;
                        int turnAround_time = end_time - p.get(i).arrtime;
                        sum = sum + turnAround_time;
                        //System.out.println(p.get(i).ProName+" ");
                        System.out.println((count++)+"            " + p.get(i).ProName + "         " + start_time + "-" + end_time + "        " + turnAround_time);
                    } else {
                        int start_time = p.get(i).arrtime;
                        int end_time = start_time + p.get(i).duration;
                        global_time = end_time;
                        int turnAround_time = end_time - p.get(i).arrtime;
                        sum = sum + turnAround_time;
                        //System.out.println(p.get(i).ProName+" ");
                        System.out.println((count++)+ "            " + p.get(i).ProName + "         " + start_time + "-" + end_time + "        " + turnAround_time);
                    }
                }
                float avg_tur_time = sum / p.size();
                System.out.println("A.T.T-" + " " + avg_tur_time);
            }else {
                x++;
            }
        }

    }
}
/*01 A 40 0
02 B 50 0
03 C 10 5
04 D 20 38
05 E 15 25

01 A 4 0
02 B 6 8
03 C 8 10
04 D 20 38
05 E 15 25*/