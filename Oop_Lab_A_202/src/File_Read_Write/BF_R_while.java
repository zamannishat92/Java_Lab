package File_Read_Write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BF_R_while {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Data/A.txt");
            BufferedReader reader = new BufferedReader(fr);

            Student []students = new Student[10];
            int index = 0;

            String line = reader.readLine();

            while(line != null) {
                if(line.length() == 0) {
                    line = reader.readLine();
                    continue;
                }

                String delimiter = " ";
                String[] splits = line.split(delimiter);

                String name = splits[0];
                int id = Integer.parseInt(splits[1]);
                double cgpa = Double.parseDouble(splits[2]);

                Student st = new Student(name, id, cgpa);
                students[index++] = st;

                line = reader.readLine();
            }

            for(int i = 0; i < index; i++){
                Student st = students[i];
                System.out.println(st.getName() + " " + st.getId());
            }

            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
