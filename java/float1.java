import java.util.*;
public class float1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b:");
        float b = sc.nextFloat();
        float c= a/b;
        Formatter formatter = new Formatter();
        formatter = new Formatter();
        formatter.format("%.3f", c);
        System.out.print( + c +" " + formatter );
      // System.out.println("Decimal floating-point"
      // + " notation to 4 places: "
      // + formatter);

// Format 4 places.  
    }

}