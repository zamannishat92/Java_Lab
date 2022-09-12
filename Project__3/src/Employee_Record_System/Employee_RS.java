package Employee_Record_System;

import java.util.Scanner;

public class Employee_RS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee's information:");
        int l = sc.nextInt();
        sc.nextLine();
        Salaried[] a = new Salaried[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter the employee name.");
            String name = sc.nextLine();
            System.out.println("Enter the employee salary.");
            int salary = sc.nextInt();
            sc.nextLine();
            a[i] = new Salaried(name, salary);
        }

        System.out.println("Enter the number of Hourly employee's information:");
        int l1 = sc.nextInt();
        sc.nextLine();
        Salaried[] a1 = new Hourly[l1];
        for (int i = 0; i < l1; i++) {
            System.out.println("Enter the employee name:");
            String name = sc.nextLine();
            System.out.println("Enter the salary per hour:");
            int s_1 = sc.nextInt();
            System.out.println("Enter how many hours the employee worked:");
            int h = sc.nextInt();
            sc.nextLine();
            a1[i] = new Hourly(name, s_1, h);
        }

        System.out.println("Enter the number of commisioned employee's information:");
        int l2 = sc.nextInt();
        sc.nextLine();
        Salaried[] a2 = new Commisioned[l2];
        for (int i = 0; i < l2; i++) {
            System.out.println("Enter the employee name.");
            String name = sc.nextLine();
            System.out.println("Enter comossioned per sell.");
            int s_2 = sc.nextInt();
            System.out.println("Enter how many product the employee sold.");
            int p = sc.nextInt();
            sc.nextLine();
            a2[i] = new Commisioned(name, s_2, p);
        }


        System.out.println("Enter the choise");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Regular salaried employee.");
            for (int i = 0; i < l; i++) {
                a[i].print();
            }

            System.out.println("Hourly salaried employee.");
            for (int i = 0; i < l1; i++) {
                a1[i].print();
            }

            System.out.println("Comossioned salaried employee.");
            for (int i = 0; i < l2; i++) {
                a2[i].print();
            }
        }

    }

}
