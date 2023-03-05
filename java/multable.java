import java.util.*;
public class multable{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int i;
        int p;
        for(i=1;i<=10;i++)
        {
            p = n*i;
            System.out.println(p);
        }

    }
}