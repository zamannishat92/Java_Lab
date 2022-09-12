package Q1;

public class CollegeStudent extends Student {
    public int classPosition;

    public CollegeStudent(String name,String id,double cgpa,int classPosition){
        super(name,id,cgpa);
        this.classPosition = classPosition;

    }
    public void print(){
        System.out.println("College Student name:" + name);
        System.out.println("College Student ID:" + id);
        System.out.println("College student CGPA:"+cgpa);
    }



    @Override
    public double calScholarship() {
        return ((cgpa *10000) + (10000 / classPosition));


    }


}
