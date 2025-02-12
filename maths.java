//function with parameters
public class maths {
	void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	void div(int num1,int num2) {
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
		maths obj1 = new maths();
		obj1.sum(20,10);//sum
		obj1.sub(20,15);//sub
		obj1.mul(20,10);//multiply
		obj1.div(50,25);//divide
	}
