package File_Read_Write;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Final_2a {
    public static void main(String[] args){
        try{
            File f = new File("students.txt");
            Scanner sc = new Scanner(f);

            ArrayList<Student> students = new ArrayList<>();
            int index = 0;
            while(sc.hasNext()){
                String name = sc.next();
                int id = sc.nextInt();
                double cgpa = sc.nextDouble();

                students.add(new Student(name, id, cgpa));
                index++;
            }
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student student, Student t1) {
                    if(student.getCgpa() < t1.getCgpa()){
                        return 1;
                    }
                    if(student.getCgpa() > t1.getCgpa()) return -1;
                    return 0;
                }
            });
            for(Student s: students){
                System.out.println(s.getName() + " " + s.getId() + " " + s.getCgpa());
            }
            PrintWriter out = new PrintWriter("sorted.txt");
            for(Student s:students){
                out.println(s.getName() + " " + s.getId() + " " + s.getCgpa());
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}