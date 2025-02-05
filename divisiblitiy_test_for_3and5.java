import java.util.Scanner;
public class divisiblitiy_test_for_3and5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter from: ");
		int from = scan.nextInt();
		System.out.println("Enter to");
		int to = scan.nextInt();
		for(int i=from;i<=to;i=i+1) {
			if(i%3==0 && i%5==0 ) { // check whether it is divisible by both 3&5
				System.out.println(i);
			}
		}

	}

}
