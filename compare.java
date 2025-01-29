//comparing two strings
import java.util.Scanner;

public class compare {
    public  static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String RCB = scan.nextLine(); //input string
        String win = "win"; //string1
        String lose = "lose"; //string2
        if(RCB.equals("win")){
            System.out.println("Eee saala cup namdhey");
        }
        else{
            System.out.println("next time cup namdhey");
        }
    }
    
}
