package File_Read_Write;
// Append to file
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Append {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("Data/C.txt", true);
            // Also works for BufferedWriter

            PrintWriter out = new PrintWriter(f);
            out.println("10 20 30 40");
            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
