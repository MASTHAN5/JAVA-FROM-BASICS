import java.util.ArrayList;
import java.util.List;
public class fizzbuzz{
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(); // Create a list 
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) { // Check if divisible by both 3 and 5
                answer.add("FizzBuzz"); // Add "FizzBuzz" to the list
            } else if (i % 3 == 0) { // Check if divisible by 3
                answer.add("Fizz"); // Add "Fizz" to the list
            } else if (i % 5 == 0) { // Check if divisible by 5
                answer.add("Buzz"); // Add "Buzz" to the list
            } else {
                answer.add(String.valueOf(i)); 
            }
        }
        return answer; 
    }
    public static void main(String[] args) {
        int n = 15; // Example: Set the value of n
        List<String> result = fizzBuzz(n);
        System.out.println(result); 
    }
}
