import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();

        int total = s1+s2+s3+s4+s5;//total
        int average =  total/5;//average
        
        if(average<35){
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("You are good to goo");
        }
       

    }
    
}
