import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] inputArray = new int[length];

        // Populate the array
        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("Second Largest number = " + findSecondLargest(inputArray));
        scanner.close();
    }

    private static int findSecondLargest(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : inputArray) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
            return max; // Or return Integer.MIN_VALUE or any error indication
        }

        return secondMax;
    }
}
