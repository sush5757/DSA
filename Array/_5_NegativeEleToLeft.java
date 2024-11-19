
public class _5_NegativeEleToLeft {

    public static int[] negativeEleToLeft(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {

            if (a[low] < 0) {
                low++;
            } else if (a[high] > 0) {
                high--;
            } else {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -2, 4, -2, 3, -6, -10};
        negativeEleToLeft(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
