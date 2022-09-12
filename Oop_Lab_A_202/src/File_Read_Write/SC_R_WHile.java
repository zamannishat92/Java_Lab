package File_Read_Write;
        import java.io.File;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Objects;
        import java.util.Scanner;
        import java.io.FileNotFoundException;


public class SC_R_WHile {
    public static void main(String[] args) {

        try{
            File f = new File("students.txt");
            Scanner sc = new Scanner(f);

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Input ID--");
            int id1 = sc1.nextInt();

            ArrayList<Student>  students = new ArrayList<>();
            int index = 0;

            while(sc.hasNext()){
                String name = sc.next();
                int id = sc.nextInt();
                double cgpa = sc.nextDouble();

                students.add(new Student(name, id, cgpa));

                index++;
            }
            int flag = 0;

            for(Student st:students){

                if (Objects.equals(st.getId(), id1)) {
                    flag = 1;
                    System.out.println(st.getName() + " " + st.getId() + " " + st.getCgpa());
                }

            }
            if(flag == 0)System.out.println("Students not found");
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
