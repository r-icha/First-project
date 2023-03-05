import java.util.*;
public class Calculator{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                char operators = sc.next().charAt(0);
                switch(operators)
                {
                        case '+' :System.out.println("sum is");
                        System.out.print(a+b);
                        break;
                        case '-' :
                        System.out.println(a-b);
                        break;
                        case '*' :
                        System.out.println(a*b);
                        break;
                        case '/' :
                        System.out.println(a/b);
                        break;
                        case '%' :
                        System.out.println(a%b);
                        break;
                        default : System.out.println("operator is not correct");

                }
                
        }
} 