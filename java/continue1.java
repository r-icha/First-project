import java.util.*;
public class continue1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if(i%10==0){
                continue;
            }
            System.out.println(i);
        }
    }
}