package File_Read_Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Main{
    public static void main(String[] args) {
        //Write to file using BufferedWriter
        try {
            FileWriter fw = new FileWriter("B.txt");
            BufferedWriter out = new BufferedWriter(fw);

            out.write("ABCDE");
            out.newLine();
            out.write("FGHI");

            out.write(97);  // prints a
            out.newLine();
            out.write(97 + "");  // Convert to string first
            out.newLine();
            out.write(String.valueOf(10.55));
            out.newLine();

            //for (int i = 1; i <= 100; i++) {
               // out.write(i + "");
              //  out.newLine();
            //}

            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}