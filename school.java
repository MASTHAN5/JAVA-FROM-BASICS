import java.util.Scanner;

public class school {
	void passorfail(int num) {
		if(num >= 250 && num <500 ) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //getting 5 input 
		System.out.print("Enter tamil mark: ");//subject:1
		int tamil = scan.nextInt();
		System.out.println();
		System.out.print("Enter english marks");//subject:2
		int english = scan.nextInt();
		System.out.println();
		System.out.print("enter maths marks");//subject:3
		int maths = scan.nextInt();
		System.out.println();
		System.out.print("Enter science marks");//subject:4
		int science = scan.nextInt();
		System.out.println();
		System.out.print("Enter social marks");//subject:5
		int social = scan.nextInt();
		
		int total_mark= tamil+english+maths+science+social; // total of all subject
		school obj1 = new school();
		obj1.passorfail(total_mark);
		
	}

}
