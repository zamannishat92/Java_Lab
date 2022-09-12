import java.io.IOException;
import java.util.Scanner;
import java.io.*;


public class FileRead {
    public static void main(String[] args){
        try{
            FileReader f = new FileReader("B");
            Scanner sc = new Scanner(f);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            sum = a + b;
            System.out.println(sum);

            sc.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
