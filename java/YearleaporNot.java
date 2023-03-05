import java.util.*;
public class YearleaporNot{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year is:");
    int Year = sc.nextInt();
    if(Year%4 == 0)
    {
        System.out.println("Year is leap Year");
    }
    else{
        System.out.println("Year is not a leap year");
    }

    }
}