//METHOD OVER LOADING
public class method {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
 public static void main(String[] args) {
	 method obj1 = new method();
   //adding first 2 numbers
	 obj1.sum(10, 30); 
   //adding second 3 numbers 
	 obj1.sum(30, 40, 50);
 }
}
