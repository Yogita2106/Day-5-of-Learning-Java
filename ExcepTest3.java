import java.lang.*;
import java.util.Scanner;
public class ExcepTest3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.println("Enter a string : ");
        //String str=input.next();
        String str=null;
        try {
            // if(str.length()!=0){
            //     System.out.println(str);
            // }else{
                System.out.println(str.length());
            // }
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: String is null");
        }
    }
}