package Employee_Record_System;

public class Salaried {
    private String empName;
    private int emSalary;

    Salaried(String empName,int emSalary){
        this.empName = empName;
        this.emSalary = emSalary;
    }

    public String getEmpName(){ return empName;}
    public int getEmSalary(){ return emSalary;}

    void print(){

    	System.out.println("Name: "+empName+" "+"Salary: "+emSalary);
}


}
