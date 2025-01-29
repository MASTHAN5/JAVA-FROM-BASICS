/to check the number is odd or even
import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    if(num1%2==0){  //
        System.out.println(num1 +" is even"); //even
    }
    else{
        System.out.println(num1 +" is odd"); //odd
    }
    }
    
}
