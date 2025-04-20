import java.lang.*;
//import java.IO.ArithmeticException; 

public class denom {
    public static void main(String[] args) {
        int a = 5, b=0;
        denom d = new denom();
        try{
            if(b!=0){
                System.out.println(a/b);
            }else{
                System.out.println(a/0);
            }
        }catch(ArithmeticException e){
            System.out.println("Not able to divide with denominator 0");
        }
    }
}