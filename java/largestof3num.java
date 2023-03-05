import java.util.*;
public class largestof3num{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b)
    {
        System.out.println("a is greater");
    }
    else if(b>a && b>c)
    {
        System.out.println("b is greater");
    }
    else 
    {
        System.out.println("c is greater");
    }
    }
}