import java.util.*;
public class Multiply_function{
    public static int Multiply(int a, int b)
    {
        int product = a*b;
        System.out.println("multiply is : " + product);
        return product;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = Multiply(a, b); //
        System.out.println("Multiply is :" +prod);//
        prod = Multiply(a, b);
        System.out.println("Multiply is :" + prod);
    }
}