import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        int a=scan.nextInt();
        System.out.println("enter b");
        int b =scan.nextInt();
        if(a<b){
        do{
            System.out.println("Enter greater than " +b);
          a = scan.nextInt(); //it will not stop until while gets false
        }while( a < b);
        System.out.println("It is correct");}
        else{
            System.out.println("It is correct");
        }

    }
    
}
