// Import the Required Class
import java.security.*;

// Define the Class and Main Method
public class passwordGenerator {
    public static void main(String[] args) {
        int passwordLength = 8;
        String password = generatePassword(passwordLength);
        System.out.println("Generated password = " + password);
    }

    // Create the Password Generator Method
    private static String generatePassword(int length) {
        // Define Character Sets
        final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        final String numbers = "0123456789";
        final String special = "!@#$%^&*()-_+=<>?/{}[]";
        final String allChars = upperCase + lowerCase + numbers + special;

        // Start Building the Password
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Add 1 character from each type
        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        // Fill the Remaining Characters
        for (int i = 1; i <= 4; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the Password (to mix things)
        return shuffleString(password.toString());
    }

    // Shuffle Function
    private static String shuffleString(String inputString) {
        char[] characters = inputString.toCharArray();
        SecureRandom random = new SecureRandom();

        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}
