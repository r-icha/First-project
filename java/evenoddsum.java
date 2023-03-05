import java.util.*;
public class evenoddsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n =sc.nextInt();
        int i;
        int sum=0;
        int sum1 =0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0){
            sum = sum+i;
            }
            if(i%2!=0)
            {
                sum1 = sum1+i;
            }
        }
        System.out.println("even sum: " + sum);
        System.out.println("odd sum: " +  sum1);
    }
}