public class FirstNonRepeating {
    public static void main(String[] args) {
        // Test cases
        printFirstNonRepeating("abcdabcd"); // All characters repeat, should print -1
        // printFirstNonRepeating("%%$$@@?");  // '?' is the only non-repeating character
        // printFirstNonRepeating("Aa");       // Case-sensitive: 'A' and 'a' are different
    }

    // Helper method to print the first non-repeating character or -1 if none exists
    private static void printFirstNonRepeating(String input) {
        Character result = findFirstNonRepeating(input);
        System.out.println(result == null ? "-1" : result);
    }

    // Method to find the first non-repeating character in the input string
    private static Character findFirstNonRepeating(String input) {
        // ASCII character count array (size 256 to handle all standard characters)
        int[] count = new int[256];

        // First pass: Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < input.length(); i++) {
            if (count[input.charAt(i)] == 1) {
                return input.charAt(i); // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return null
        return null;
    }
}
