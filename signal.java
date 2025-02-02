import java.util.Scanner;
public class signal {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String colour= scan.nextLine();
        if(colour.equals("red")){ //comparing string
            System.out.println("STop.");
        }
        else if(colour.equals("yellow")){
            System.out.println("Get ready");
        }
        else{
            System.out.println("gooo");
        }
    }
}
