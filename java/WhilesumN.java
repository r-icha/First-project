import java.util.*;
public class WhilesumN{
    public static void main(String args[]){
        scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.println("Enter value of n:");
        int n  = sc.nextInt();
        while(num<=n)
        {
            System.out.println(num+n);
            num++;
        }
        
    }
}