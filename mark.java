//pass or fail
import java.util.Scanner;
public class mark {
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int mark = scan.nextInt();
     if(mark>=35){
        System.out.println("pass"); //pass if the input gets above 34
     }
    else{
        System.out.println("fail"); //else fail
    }
    }

    
}
