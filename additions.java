public class additions {
	int sum(int a, int b) {
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		additions obj1 = new additions();
		int sum=obj1.sum(10,20);
		System.out.println(sum);
	}

}
