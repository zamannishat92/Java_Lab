import java.util.Scanner;

public class AddressBookApplication {
    private String bName;

    public void setBName(String bName) {
        this.bName = bName;
    }

    public String getBName() {
        return bName;
    }



    AddressBookApplication(String bName) {
        this.bName = bName;

    }

    public void updateRecord(String bName) {
        this.bName = bName;

        System.out.println("Update Successfully!");
    }
    void print(){
        System.out.println("Book Name: "+bName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Multiple entries in the address book: ");
        int aBook_len = sc.nextInt();
        AddressBookApplication[] aBook = new AddressBookApplication[aBook_len];

        int a = 0;
        while (a != 4) {
            System.out.println("******************************");

            System.out.println("1.New Record ");
            System.out.println("2.Update Record ");
            System.out.println("3.Delete Record ");
            System.out.println("4.Exit ");

            System.out.println("*****************************");
            System.out.println("Choose the OPTION::");
            int b = sc.nextInt();

            if (b == 1) {

                for (int i = 0; i < aBook_len; i++) {
                    System.out.println("Enter the NEW book name :");
                    String bName = sc.next();
                    sc.nextLine();
                    aBook[i] = new AddressBookApplication("bName");
                    //sc.hasNext();
                }
            }
            else if (b == 2) {
                System.out.println("Enter the book name which wanna update :");
                String s1 = sc.next();
                sc.nextLine();
                for (int i = 0; i < aBook_len; i++) {
                    if (s1.equals(aBook[i].getBName())) {
                        System.out.println("The Update book name:");
                        String book = sc.nextLine();
                        sc.nextLine();
                        aBook[i].updateRecord(book);
                    }

                }


            }
            else if (b == 3) {
                System.out.println("Enter the book name which wanna Delele :");
                String s2 = sc.next();
                sc.nextLine();
                for (int i = 0; i < aBook_len; i++) {
                    if (s2.equals(aBook[i].getBName())) {
                        aBook[i] = null;
                        System.out.println("Delete Successfully!");

                    }
                }


            }
            else if(b == 4){
                for(int i = 0;i < aBook_len ; i++){
                    aBook[i].print();
                }
            }
            else {
                a++;
                System.out.println("Exit from the code!!!");
            }
        }
    }
}
