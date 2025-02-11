public class function {
  //Creating 1st function
	void greetings() {
		System.out.print("GOOD MORING");
		dummy(); //calling second fn in first
	}
  //creatind second function
	static void dummy() {
		System.out.print(",MAM");
	}

	public static void main(String[] args) {
		function obj1 = new function(); //creating a object
		obj1.greetings(); //call first function
		
	}

}
