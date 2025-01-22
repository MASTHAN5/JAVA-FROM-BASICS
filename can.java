//GETTING AN INPUT USING SCANNER
import java.lang.System;
import java.util.Scanner;

public class can{
    public static void main(String args[])
      {
        Scanner john = new Scanner(System.in);
        Scanner rocky = new Scanner(System.in);
        int a = john.nextInt();
        int b = john.nextInt();
        int d = a+b;
        String Name = rocky.nextLine();
        System.out.println(d);
        System.out.println(Name);
    }
}

//INPUT 
// 10
// 11
// emc
//OUTPUT
// 21
// emc
