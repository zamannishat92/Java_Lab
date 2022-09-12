package File_Read_Write;
    // Read from file using Scanner

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

    class Sreader{
        public static void main(String[] args) {
            //Read From file using Scanner
            try{
                File f = new File("src/File_Read_Write/C");
                Scanner sc = new Scanner(f);

           int a = sc.nextInt();
           int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);


               // String name = sc.next();
                //int id = sc.nextInt();
                //double cgpa = sc.nextDouble();
                //Student s1 = new Student(name, id, cgpa);

              // System.out.println(s1.getName() + " " +
                        //s1.getId() + " " + s1.getCgpa());

                sc.close();

                // Task: read 2 ints from a file
                // print their sum to console.
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

