import java.util.Scanner;
public class loan {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your salary amount:");//getting inpt
        int salary = scan.nextInt();
        System.out.println("Enter your age");
        int age = scan.nextInt();
    if(salary>20000 || age <25){
        System.out.println("you are eligible");
        System.out.println("how much do you need?");
        int amount = scan.nextInt();
        if (amount<50000){
            System.out.println("yes");

        }
    }
    else{
        System.out.println("your are not eligible");
    }
    
}
}
