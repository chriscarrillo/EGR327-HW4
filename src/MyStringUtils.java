public class MyStringUtils {
    /**
     * Reverses the passed in string
     * @param s the passed in string that will be reversed
     * @return the reversed string
     */
    public static String reverse(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }

    /**
     * Checks if the passed in string is a palindrome
     * @param s the passed in string in consideration
     * @return true if the string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        //StringBuilder palindrome = new StringBuilder(s).reverse(); // StringBuilder that reverses word typed.
        String palindrome = MyStringUtils.reverse(s);

        if (s.equals(palindrome)) { // Checks equality between words
            return true; // If equal, it is a palindrome.
        } else {
            return false; // If not, it is not a palindrome.
        }
    }

    /**
     * Counts how many vowels are in the passed string s
     * @param s the passed string in consideration
     * @return the number of vowels in s
     */
    public static int countOfVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i'
                    || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Checks if the main string's odd characters equal the subString
     * @param main the passed string in consideration
     * @param subString the part of the string that may or may not be in main
     * @return true if main's odd characters equal subString
     */
    public static boolean oddContains(String main, String subString) {
        String oddString = "";
        for (int i = 0; i < main.length(); i++) {
            if (i % 2 == 0) {
                oddString += main.charAt(i);
            }
        }
        return oddString.equals(subString);
    }
}
