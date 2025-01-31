public class palindromechecker {
    public static boolean isPalindrome(String s) {
        String lowerCaseS = s.toLowerCase(); //  Convert to lowercase
        StringBuilder cleanS = new StringBuilder(); // Remove non-alphanumeric characters
        for (int i = 0; i < lowerCaseS.length(); i++) {
            char c = lowerCaseS.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanS.append(c);  
            }
        }
        String cleanedString = cleanS.toString(); 
        //Check if it's a palindrome
        int left = 0; // Index of the first character
        int right = cleanedString.length() - 1; // Index of the last character
        while (left < right) {  // Go until the pointers meet in the middle
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) { // Check if characters are different
                return false; // Not a palindrome
            }
            left++; // Move left pointer to the right
            right--; // Move right pointer to the left
        }
        return true; // If the loop finishes without finding any differences, it's a palindrome
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        boolean isPal1 = isPalindrome(s1);
        System.out.println("\"" + s1 + "\" is a palindrome: " + isPal1); // Output: true
        String s2 = "race a car";
        boolean isPal2 = isPalindrome(s2);
        System.out.println("\"" + s2 + "\" is a palindrome: " + isPal2); // Output: false
        String s3 = " ";
        boolean isPal3 = isPalindrome(s3);
        System.out.println("\"" + s3 + "\" is a palindrome: " + isPal3); // Output: true
        String s4 = "hello";
        boolean isPal4 = isPalindrome(s4);
        System.out.println("\"" + s4 + "\" is a palindrome: " + isPal4); // Output: false
    }
}
