import java.util.HashSet;
import java.util.Set;

public class OccurenceOfNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1, 4, 5, 1, 2 };
        findOccurence(arr);
    }

    public static void findOccurence(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int n : nums) {
            if (!mySet.contains(n)) {
                int count = findCout(n, nums);
                System.out.println(n + " occured " + count + " times");
            }
            mySet.add(n);
        }
    }

    public static int findCout(int num, int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n == num)
                count++;
        }
        return count;
    }
}
