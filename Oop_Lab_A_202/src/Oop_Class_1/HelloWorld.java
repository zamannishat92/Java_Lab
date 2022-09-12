package Oop_Class_1;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        double sum=0.00,avg;
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[5];
        System.out.println("Enter the array numbers:");
        for(int i=0 ; i<5;i++) {
            arr[i] = sc.nextDouble();
        }
        for(int i=4;i>=2;i--){
            System.out.println(arr[i]);
        }
        for(int i=0; i<5;i++) {
            sum = sum + arr[i];

        }
        avg = sum/5;
        System.out.println("The average is"+avg);
    }
}