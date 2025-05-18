import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpiralArray {

    public static void main(String[] args) {
        int N = 7;
        int[][] array = generateRandomArray(N);

        System.out.println("Исходный массив:");
        printArray(array);

        List<Integer> snailResult = snail(array);
        System.out.println("Результат (змейка):");
        System.out.println(snailResult);
    }

    public static int[][] generateRandomArray(int N) {
        Random rand = new Random();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        if (array == null || array.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(array[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(array[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(array[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(array[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}