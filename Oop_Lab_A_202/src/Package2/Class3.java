package Package2;


import Package.Class1;

import java.util.Scanner;

    public class Class3 {
        public static void main(String[] args) {
        /* Using full name of a class
        package1.Class1 class1Object =
                new package1.Class1(50);
         */

            Class1 class1Object = new Class1(60);

            class1Object.printData();
            class1Object.data = 30;

            Scanner sc = new Scanner(System.in);
        }
    }


