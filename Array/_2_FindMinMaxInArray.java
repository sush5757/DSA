
import java.util.Arrays;

public class _2_FindMinMaxInArray {

    public static int setmini(int[] arr) {

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static int setmaxi(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {

                maxi = arr[i];

            }

        }
        return maxi;
    }

    static class Pair {

        public int min;
        public int max;

    }

    public static Pair getMinMax(int[] a, int n) {

        Pair MinMax = new Pair();
        Arrays.sort(a);
        MinMax.min = a[0];
        MinMax.max = a[a.length - 1];
        return MinMax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 100, 4, 1, 9};
        System.out.println();
        System.out.println("Max : " + setmaxi(arr) + " Min : " + setmini(arr) + " ");
        System.out.println();

        int[] a = {3, 5, 100, 4, 1, 9};
        System.out.println();
        Pair minmax = getMinMax(a, a.length - 1);
        System.out.println("Max : " + minmax.max + " Min : " + minmax.min + " ");
        System.out.println();
    }

}
