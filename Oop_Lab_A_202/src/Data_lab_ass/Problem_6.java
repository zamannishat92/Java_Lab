package Data_lab_ass;


import java.util.Scanner;

public class Problem_6 {
    public static void emailfunc(String email){
        String delimeter = "@";
        String[] splits = email.split(delimeter);
        String l=splits[0];
        String r = splits[1];
        //arrayfunc(l,r);
        String[] a1=new String[l.length()];
        String[] a2=new String[r.length()];
        for(int i=0;i<l.length();i++){
            a1[i]=l.substring(i,i+1);
        }
        for(int i=0;i<r.length();i++){
            a2[i]=r.substring(i,i+1);
        }
        int flag=0;
        int m=l.length()-6;
        for(int i=0;i<m;i++){
           if(l.charAt(i)>=97 && l.charAt(i)<=122){
              flag++;
           }
        }
        int j=0;
        int[] a3 = new int[6];
        for(int i=m ; i<l.length();i++){
            a3[j] = Integer.parseInt(a1[i]);
            j++;
        }
        if(flag!=0){

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        emailfunc(email);

    }
}