import java.util.*;
public class breakloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++)
        {
            if(i==4)
            {
                break;
            }
        System.out.println(i);
        }
        System.out.println("I am out of the loop");

    }
}