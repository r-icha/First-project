import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number:");
        int n = 3;
        int i;
        for(i=1;i<=5;i++)
        {
            if(n%i==0){
                System.out.println("it is a prime number");
            }
                else
                 {
                    System.out.println("it is not prime");
                }
            
        }
    }
}