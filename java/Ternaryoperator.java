import java.util.*;
public class Ternaryoperator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String type = (a%2==0) ? "even":"odd";
        System.out.println(type);
    }
}