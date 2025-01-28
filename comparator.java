//comparion operator
import java.util.Scanner;

public class comparator {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in); //getting input from the user
    int num1 = scan.nextInt(); //num1
    int num2 = scan.nextInt(); //num2
    if(num1>num2){
        System.out.println("Number 1 is greater, it is " +num1); //num1 is greater
    }
    
    if(num1==num2){
            System.out.println("Both the numbers are equal, it is " +num1); //both are equal
        }
    else{
        System.out.println("Number 2 is greater, it is " +num2); //num2 is greater 
    }
}

}
