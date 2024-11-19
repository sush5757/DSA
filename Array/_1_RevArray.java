
import java.util.Arrays;
import java.util.Collections;

public class _1_RevArray {

    public static void RevArrayUsingExtraSpace(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            res[i] = arr[arr.length - i - 1];
        }
        printArray(res);

    }

    public static void printArray(int[] res) {
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void RevUsingCOllection(int[] arr) {
        Integer[] a = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }

        Collections.reverse(Arrays.asList(a));

        System.out.println(Arrays.toString(a));

    }

    public static void RevArraySwapping(int[] arr) {

        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //  RevArrayUsingExtraSpace(arr);
        // RevArraySwapping(arr);
        RevUsingCOllection(arr);
    }
}
