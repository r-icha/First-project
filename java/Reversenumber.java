import java.util.*;
public class Reversenumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int num= 18099;
    
    while(num>0) 
    {
        int lastdigit= num % 10;
        System.out.print(lastdigit);
        num = num/10;
    } 
    
    }
}