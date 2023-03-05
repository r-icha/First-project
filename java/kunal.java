import java.util.*;
public class kunal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;
    
        if(income<500000)
        {
            tax = 0.1f*income;
            System.out.println(tax);
        }
        else if(income>500000 && income<1000000)
        {
            tax = 0.2f*income;
            System.out.println(tax);
        }
        else 
        {
            tax = 0.3f*income;
            System.out.println(tax);
        }
    }
}