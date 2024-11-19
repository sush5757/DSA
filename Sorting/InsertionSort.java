
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 8};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        insertionSort(array);
        System.out.println();

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
