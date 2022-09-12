package Q2;

public class Odd {
    int a;

    Odd(int a) {
        this.a = a;
    }

    public void oddCheck() {
        if (a % 2 != 0) {
            System.out.print(a+" ");
        }
    }
}