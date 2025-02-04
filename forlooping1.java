import java.util.Scanner;
public class forlooping1 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in); //getting input 
       System.out.println("Enter an integer: ");
       int abc=scan.nextInt();
        for(int i=abc;i<=10;i=1+i){ //looping from 1 to 10
            System.out.println(i);
        }

    }
}
