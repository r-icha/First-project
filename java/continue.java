import java.util.*;
public class continue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}