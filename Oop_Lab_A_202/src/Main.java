import Package.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Arif",
                "a@gmail.com",
                3.5,
                102);

//        System.out.println(student.cgpa);

        System.out.println(student.getCgpa()); // 3.5

        student.setCgpa(4.5);

        System.out.println(student.getCgpa()); // 3.5

        student.setCgpa(3.8);

        System.out.println(student.getCgpa()); // 3.8

    }
}
