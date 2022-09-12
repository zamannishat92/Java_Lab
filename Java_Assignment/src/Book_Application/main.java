package Book_Application;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Number of record: ");
        int l=sc.nextInt();
        Book_app[] book=new Book_app[l];

        int x=0;
        while(x!=1){
            System.out.println("***************************");

            System.out.println("1.New Record");
            System.out.println("2.Update Record");
            System.out.println("3.Delete Record");
            System.out.println("4.Exit");
            System.out.println("5.print");

            System.out.println("*******************************");
            System.out.print("Choose the option: ");

            int s=sc.nextInt();

            if(s==1){
                for(int i=0;i<l;i++){
                    System.out.print("ENTER THE BOOK NAME: ");
                    String book_address=sc.next();
                    book[i]=new Book_app(book_address);
                }
            }
            else if(s==2){
                System.out.print("Enter the book name which  wanna update: ");
                String s1=sc.next();
                sc.nextLine();
                for(int i=0;i<l;i++){
                    if(s1.equals(book[i].getBook())){
                        System.out.print("Update the book address name: ");
                        String b=sc.next();
                        sc.nextLine();
                        book[i].update(b);
                    }
                }

            }

            else if(s==3){
                System.out.print("Enter the book address want to delete: ");
                String s1=sc.next();
                sc.nextLine();
                for(int i=0;i<l;i++){
                    if(s1.equals(book[i].getBook())){
                        book[i]=null;
                        System.out.println("Deleted successfully.");
                    }
                }
            }
            else if(s==5){
                for(int i=0;i<l;i++){
                    book[i].print();
                }
            }
            else if(s==4){
                x++;
            }


        }

    }

}


