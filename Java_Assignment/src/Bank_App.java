import java.util.Scanner;

public class Bank_App {
    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    Bank_App(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public double deposit(double balance) {
         return balance;

    }
    public double Withdraw(double amount2) {

        return  amount2;
    }
    public double Check_Money(double a ,double b ){
        return a-=b;
    }



public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NAME and ID of your new account:");
        String name = sc.nextLine();
        String id = sc.nextLine();
        //double balance = sc.nextDouble();

        Bank_App bank = new Bank_App("name","id");

        System.out.print("Enter the deposite balance:");
        double amount1 =sc.nextDouble();
        double a = bank.deposit(amount1);
        System.out.println("Balance after deposit:"+a);
        System.out.println("Successfully deposited!");

        System.out.println("Enter the withdraw balance:");
        double amount2 = sc.nextDouble();
        if(amount2<amount1) {
            double b = bank.Withdraw(amount2);
            System.out.println("Balance after Withdraw:" + b);
            System.out.println("Successfully Withdraw money!!");
        }

        System.out.println("Check the balance:");
        if(amount2<amount1) {

            double c = bank.Check_Money(amount1,amount2);
            System.out.println("The Final Balance:::::"+c);

        }
        else{
            System.out.println("NOT ENOUGH BALANCE!!");
        }
    }
}
