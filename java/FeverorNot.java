import java.util.*;
public class FeverorNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature of patient is");
        float temp = sc.nextFloat();
        if(temp>100)
        {
            System.out.println("You have a Fever");
        }
        else
        {
            System.out.println("you don't have a fever");
        }
    }

}