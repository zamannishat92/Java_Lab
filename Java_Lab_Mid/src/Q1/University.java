package Q1;

public class University {
    public static void main(String[] args){

        System.out.println("ENTER THE INFORMTION OF 3 COLLEGE STUDENTS!!");
        System.out.println("");

        System.out.println("Here is the information of 1st college student:");
        CollegeStudent cs1 = new CollegeStudent("Nishat","011 181 229", 3.35,12);
        cs1.print();
        System.out.println("1st College student scholarship:"+ cs1.calScholarship());
        System.out.println("");
        System.out.println("Here is the information of 2nd college student:");
        CollegeStudent cs2 = new CollegeStudent("Nashit","011 181 220",4.00,25);
        cs2.print();
        System.out.println ("2nd College student scholarship"+cs2.calScholarship());
        System.out.println("");
        System.out.println("Here is the information of 3rd college student:");
        CollegeStudent cs3 = new CollegeStudent("Nafim","011 181 225", 2.28, 38);
        cs3.print();
        System.out.println("3rd College Student scholarship:"+cs3.calScholarship());

        System.out.println("*************************************");

        System.out.println("ENTER THE INFORMTION OF 3 GRADSTUDENTS !!");
        System.out.println("");

        System.out.println("Here is the information of 1st Grade student:");
        GradStudent gs1 = new GradStudent("Tahsin","011151221",3.39,7);
        gs1.print();
        System.out.println("1st Grade student scholarship:"+gs1.calScholarship());
        System.out.println("");
        System.out.println("Here is the information of 2nd Grade student:");
        GradStudent gs2 = new GradStudent("Sadika","011151225",2.29,8);
        gs2.print();
        System.out.println("2nd Grade student scholarship:"+gs2.calScholarship());
        System.out.println("");
        System.out.println("Here is the information of 3rd grade student:");
        GradStudent gs3 = new GradStudent("Labib","011151229",4.50,9);
        gs3.print();
        System.out.println("3rd Grade student scholarship:"+gs3.calScholarship());

    }
}
