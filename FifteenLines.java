public class FifteenLines {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        String message = "Java is fun!";
        System.out.println(message.substring(0, 4));
    }
}
