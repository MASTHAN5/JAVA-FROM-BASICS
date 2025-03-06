public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
