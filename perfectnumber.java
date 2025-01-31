public class perfectnumber {
    public static boolean isperfectnumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) sum += num / i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int[] numbersToCheck = {28, 6, 7}; // Array of numbers to check
        for (int number : numbersToCheck) {  // Enhanced for loop
            System.out.println(number + (isperfectnumber(number) ? " is" : " is not") + " a perfect number.");
        }
    }
}
