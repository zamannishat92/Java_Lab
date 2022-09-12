package Oop_Class_1;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        System.out.println(mobile.getCharge()); // Prints: 10
        // Your code here
        mobile.fastCharge();
        mobile.fastCharge();
        mobile.slowCharge();
        mobile.slowCharge();
        mobile.useMobile();
        System.out.println(mobile.getCharge()); // Should print: 35
    }

}
