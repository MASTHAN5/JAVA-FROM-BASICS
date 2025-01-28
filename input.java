//GETTING INPUT FROM THE USER 
import java.util.Scanner;
public class input{
  public static void main(String args[])
  {
  Scanner scan = new Scanner(System.in);
    String name = scan.nextLine(); //NAME
    double cgpa = scan.nextDouble(); //CGPA
    scan.nextLine();
    String department = scan.nextLine(); //DEPARTMENT

    System.out.println("im " +name); //INPUT: MOHAMED KHALESHA MASTHAN
    System.out.println("My CGPA is :" +cgpa/10 +"/10"); //89
    System.out.println("And I'm from " +department +" department"); //MECHANICAL
  }
}

//OUTPUT
//im MOHAMED KHALESHA MASTHAN
//My cgpa is 8.9/10
//And I'm from Mechanical department 
