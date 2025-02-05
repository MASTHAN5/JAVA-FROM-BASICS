import java.util.Scanner;
public class odd_even_count {

	public static void main(String[] args) {
		int oddcount = 0; //odd count from zero 
		int evencount = 0; //even count from zero
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter from: ");
		int from = scan.nextInt(); //getting input(from)
		System.out.println("Enter to: ");
		int to = scan.nextInt(); //getting input(to)
		for(int i=from;i<=to;i=i+1) {
			if(i%2==0) {
			 evencount = evencount +1; //counting even numbers
			}
			else {
			 oddcount = oddcount  + 1; //counting odd numbers
			}
		}
		System.out.println("Even count is: " +evencount);
		System.out.println("Odd count is: " +oddcount);
	}

}
