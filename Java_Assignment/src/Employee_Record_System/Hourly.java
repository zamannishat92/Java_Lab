package Employee_Record_System;

public class Hourly extends Salaried {
    private int t;
    private int emSalary;
    private String empName;

    Hourly(String empName,int emSalary,int t){
        super(empName,emSalary);
        this.t = t;
    }
    void print()
    {
        emSalary=t*emSalary;
        System.out.println("Employee Name: "+empName+" "+"Employee Salary: "+emSalary);
    }

}
