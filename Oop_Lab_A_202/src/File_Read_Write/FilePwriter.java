package File_Read_Write;

// Write to file using printwriter

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class File{
    public static void main(String[] args) {
        // Write to file
        try {
            PrintWriter out = new PrintWriter("A.txt");

            int a = 10;
            String n = "abcd";
            out.println(a + " " + n);

//            for(int i = 1; i <= 100; i++)
//                out.println(i);

            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Problem writing to file");
            e.printStackTrace();
        }
    }
}
