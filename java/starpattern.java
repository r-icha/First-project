import java.util.*;
public class starpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // int line;
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int line;
        for(line=5;line>=n;line--)
        {
            System.out.println(line);
        }

    }
} 