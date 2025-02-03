import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter int1:");
    int one= scan.nextInt(); //num1
    System.out.println("enter int two");
    int two  = scan.nextInt();  //num2

    String tery = one > two ? "one is greater" : "two is greater";
    System.out.println(tery);
    } 
    
}
