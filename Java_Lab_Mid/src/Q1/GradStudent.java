package Q1;

public class GradStudent extends Student {
    public int noOfPublications;

    GradStudent(String name,String id,double cgpa,int noOfPublications){
        super(name,id,cgpa);
        this.noOfPublications = noOfPublications;
    }

    public void print(){
        System.out.println("Grade Student name:"+name);
        System.out.println("Grade Student id:"+id);
        System.out.println("Grade Student cgpa:"+cgpa);
    }

    @Override
    public double calScholarship(){
        return ((cgpa*1000) + (10000*noOfPublications));

    }
}
