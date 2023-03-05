import java.util.*;
public class passfailusingternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
        String a = (marks>=33)?"pass":"fail";
        System.out.println(a);

    }
}