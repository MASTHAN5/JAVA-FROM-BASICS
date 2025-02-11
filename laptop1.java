public class laptop1 {
  //Creating blueprint for the object
	String name = "";
	String processor = "";
	int price = 0;
	String ram = "0";

	public static void main(String[] args) {
    //object
		laptop1 lap1 = new laptop1();
		lap1.name = "Asus";
		lap1.processor= "i7";
		lap1.price = 93000;
		lap1.ram= "16";
    
		laptop1 lap2 = new laptop1();
		lap2.name="hp";
		lap2.processor="i5";
		lap2.price=87000;
		lap2.ram = "8";
    
		laptop1 lap3 = new laptop1();
		lap3.name="dell";
		lap3.processor="i5";
		lap3.price=89000 ;
		lap3.ram="16+4";
    
		laptop1 lap4 = new laptop1();
		lap4.name="lenovo";
		lap4.processor="i9";
		lap4.price=97000;
		lap4.ram="16+4";
    
		System.out.println(lap1.name);
		System.out.println(lap2.processor);
		System.out.println(lap3.price);
		System.out.println(lap4.ram);
		

	}

}
