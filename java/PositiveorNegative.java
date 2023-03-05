import java.util.*;
public class PositiveorNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is:");
         int num = sc.nextInt();
         if(num>=0)
         {
            System.out.println("Nummber is positive");
         }   
         else
         {
            System.out.println("Number is Negative");
         }
    }
}