public class SpiralMatrix {
    private static void findSpiralMatrix(int n) {
        int[][] res = new int[n][n];

        int num = n * n;
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;

        while (num > 0) {
            // Top row (right to left)
            for (int i = right; i >= left; i--) {
                res[top][i] = num--;
            }
            top++;

            // Left row (top to bottom)
            for (int i = top; i <= bottom; i++) {
                res[i][left] = num--;
            }
            left++;

            // Bottom row (left to right)
            for (int i = left; i <= right; i++) {
                res[bottom][i] = num--;
            }
            bottom--;

            // Right row (bottom to top)
            for (int i = bottom; i >= top; i--) {
                res[i][right] = num--;
            }
            right--;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 3;
        findSpiralMatrix(num);
    }
}