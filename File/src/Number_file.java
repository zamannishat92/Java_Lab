import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Number_file {
    public static void main(String[] args) {
        try{
            File file=new File("intfile.txt");
            Scanner sc=new Scanner(file);
            int[] arr=new int[10];
            int min=0;
            int max=0;
            int sum=0;
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<10;i++){
                if(arr[i]>arr[0]){
                    max=arr[i];
                }
                else if(arr[i]<arr[0]){
                    min=arr[i];
                }
            }
            for(int i=0;i<10;i++){
                sum=sum+arr[i];
            }
            System.out.println(max+" "+min+" "+sum);
            PrintWriter out=new PrintWriter("sample.txt");
            out.println(max);
            out.println(min);
            out.println(sum);
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

