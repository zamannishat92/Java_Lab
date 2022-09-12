//import java.lang.reflect.Array;

public class Exception_1 {
    public static void main(String[] args)
    {
        int[] course = new int[10];
        try {
            System.out.println("Outer try");
            try {
                System.out.println("Start Change");
                course[10] = 1;
                System.out.println("End Change");

            } catch (NumberFormatException e) {
                System.out.println("Inner catch" + e.getMessage());
            }
        }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" Outer catch " + e.getMessage());
            }


    }
}
