package File_Read_Write;
    // Read from file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    class Breader{
        public static void main(String[] args) {
            try{
                FileReader fr = new FileReader("C.txt");
                BufferedReader reader = new BufferedReader(fr);

                String name = reader.readLine();
                String s2 = reader.readLine();
                String s3 = reader.readLine();

                int id = Integer.parseInt(s2);
                double cgpa = Double.parseDouble(s3);
                for(int i = 0 ; i<10 ; i++){
                        reader.readLine();
                }
                

                //Student st1 = new Student(name, id, cgpa);

                //System.out.println(st1.getName() + " " +
                        //st1.getId() + " " + st1.getCgpa());

                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

