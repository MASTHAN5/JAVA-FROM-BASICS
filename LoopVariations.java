public class LoopVariations {

    public static void main(String[] args) {

        // Example 1: Decrementing for loop
        for (int i = 10; i > 0; i -= 2) {
            System.out.println("Countdown: " + i);
        }

        // Example 2: Do-while loop (executes at least once)
        int j = 0;
        do {
            System.out.println("Do-while: " + j);
            j++;
        } while (j < 2);

        //Example 3: nested for loop
        for(int x = 0; x < 2; x++){
            for(int y = 0; y < 2; y++){
                System.out.println("("+x+","+y+")");
            }
        }
    }
}
