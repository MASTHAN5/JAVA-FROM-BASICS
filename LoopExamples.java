public class LoopExamples {

    public static void main(String[] args) {

        // Example 1: Simple for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Example 2: While loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        //Example 3: enhanced for loop
        int[] numbers = {1, 2, 3};
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
