//logical operator
import java.util.Scanner;
public class logicaloperator {
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt(); //getting input
     if(num%3==0 && num%5==0){ //checking whether both the numbers are divisible by 3 and 5 using and(&) operator 
        System.out.println(num + " is divisible by both");
     }
     else{
        System.out.println(num +"is not divisile");
     }
    }
    
}
