import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        // n
        // Time complexity n*2
        // Space complexity 0
        int[] arr = new int[]{2, 30, 7, 8, 3, 4, 8, 2, 0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
