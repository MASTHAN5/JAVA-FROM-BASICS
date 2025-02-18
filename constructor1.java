public class constructor1 {
	
	int marks;
	String name;
	
	constructor1(){
		System.out.println("yup!");
	}
	
	constructor1(int a){
		System.out.println(a);
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		constructor1 obj1 = new constructor1(10);
		constructor1 obj2 = new constructor1();
		
	}

}
