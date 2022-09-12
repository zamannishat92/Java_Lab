package Employee_Record_System;

public class Commisioned extends Salaried {
    private int s;
    private String empName;
    private int emSalary;

    Commisioned(String empName,int emSalary,int s){
        super(empName,emSalary);
        this.s = s;
    }
    void print(){
        emSalary = s*emSalary;
        System.out.println("Employee name:"+empName+"Employee Salary"+emSalary);
    }
}
