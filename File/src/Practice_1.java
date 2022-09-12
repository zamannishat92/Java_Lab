import java.io.*;
import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        try {
            //FileReader fr = new FileReader("C.txt");
           // BufferedReader sc = new BufferedReader(fr);
            File f = new File("A.txt");
            Scanner sc = new Scanner(f);

            int[] arr = new int[10];
            int max = 0;
            int min = 0;
            int sum = 0;

            for(int i = 0;i<10 ;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<10 ;i++) {
                if (arr[i] > arr[0]) {
                    max = arr[i];
                }
                else if(arr[i] < arr[0]){
                    min = arr[i+1];
                }
            }
            for(int i = 0;i<10 ;i++) {
                sum = arr[i]+sum;
            }
            System.out.println(max+" "+min+" "+sum+" ");
            PrintWriter writer = new PrintWriter(".txt");
            writer.println(max);
            writer.println(min);
            writer.println(sum);




            //System.out.println(a1);
            //System.out.println(a2);
            //System.out.println(a3);



            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}