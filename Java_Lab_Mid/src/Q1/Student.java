package Q1;

 public class Student {
    public String name;
    public String id;
    public double cgpa;

    public Student(String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public double calScholarship(){
        return 0.0;
    }
}
