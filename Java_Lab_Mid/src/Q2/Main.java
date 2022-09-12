package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("The length of array  = 10 ");

        System.out.println("Enter the array elements:");
        int array[] = new int[10];
        int i;
        for( i = 0 ; i < 10 ; i++){
            array[i] = scan.nextInt();

        }
        System.out.print("Even Values:");
        for( i = 0 ; i < 10 ; i++) {
            Even even = new Even(array[i]);
            even.evenCheck();
        }
        System.out.println("");
        System.out.print("odd Values:");
        for( i = 0 ; i < 10 ; i++) {
            Odd odd = new Odd(array[i]);
            odd.oddCheck();
        }


    }
}
