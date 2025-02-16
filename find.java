//odd or even using class function
import java.util.Scanner;

public class find {
	void evenorodd(int num) {
		if(num%2==0){ //check whether its odd or even
			System.out.println(num + " is an even number");
			
		}
		else {
			System.out.println(num +" is an odd number");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an number: "); //input
		int number = scan.nextInt();
		find obj1 = new find();
		obj1.evenorodd(number);
		
	}

}
