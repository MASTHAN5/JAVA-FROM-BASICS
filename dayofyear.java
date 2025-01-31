import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class dayofyear {
    public static int dayOfYear(String date) {
        // Parse the date string 
        LocalDate localDate = LocalDate.parse(date); // The format "yyyy-MM-dd" is automatically understood

        // Get the day of the year 
        int dayOfYear = localDate.getDayOfYear();

        return dayOfYear;
    }
    public static void main(String[] args) {
        String date1 = "2019-01-09";
        int day1 = dayOfYear(date1);
        System.out.println("Day number of " + date1 + ": " + day1); // Output: 9

        String date2 = "2019-02-10";
        int day2 = dayOfYear(date2);
        System.out.println("Day number of " + date2 + ": " + day2); // Output: 41

        String date3 = "2024-03-01"; // Leap year
        int day3 = dayOfYear(date3);
        System.out.println("Day number of " + date3 + ": " + day3); // Output: 61

        String date4 = "2023-12-31";
        int day4 = dayOfYear(date4);
        System.out.println("Day number of " + date4 + ": " + day4); // Output: 365

    }
}
