public class patternsb {

	public static void main(String[] args) {
		printpattern(3);
	}
	 public static void printpattern(int n) {
		for(int i=0;i<n;i=i+1){
			for(int j=0;j<i;j=j+1) {
				System.out.print("{");
			}
			if(i>0) {
				System.out.print("{}");
			}
			else {
				System.out.print("{}");
			}
			for (int j=0;j<i;j=j+1) {
				System.out.print("}");
			}
			System.out.println();
		}
	}

}

