import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter from: ");
        int from = scan.nextInt(); //getting input (from)
        System.out.println("Enter to: ");
        int to = scan.nextInt(); //getting input (to)
        for(int i=from; i<=to; i=i+1){
            if(i%2==0){ // checking whether it is true or not
                System.out.println("Even number: " +i);
            
            }
        }
    }
    
}
