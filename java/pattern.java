import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line;
        int star;
        for(line=1;line<=4;line++)
        {
            for(star=4;star>=line;star--)
            {  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}