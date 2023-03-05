import java.util.*;
public class Switchstatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("mango");
            break;
            case 2: System.out.println("Apple");
            break;
            case 3: System.out.println("Grapes");
            break;
            default : System.out.println("NO fruit");
               
        }
    }
}