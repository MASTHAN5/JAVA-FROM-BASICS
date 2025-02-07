import java.util.Random;
public class  WhileLoop{

	public static void main(String[] args) {
		Random rand = new Random();
		int newnum = 0;

		while(newnum!=5){
			newnum =rand.nextInt(11);
			System.out.println(newnum);
			newnum = newnum +1;
		}
		}
		}
