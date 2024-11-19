
public class CountingSort {

    public static void sortFunction(int[] inputArray) {
        int max = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }

        int[] countingArray = new int[max + 1];
        for (int i = 0; i < inputArray.length; i++) {
            countingArray[inputArray[i]]++;
        }

        displayArr(inputArray);
        System.out.println();
        displayArr(countingArray);

        for (int i = 1; i <= max; i++) {
            countingArray[i] = countingArray[i] + countingArray[i - 1];
        }
        System.out.println();
        displayArr(countingArray);
        int[] res = new int[inputArray.length];

        for (int i = inputArray.length - 1; i >= 0; i--) {

            res[--countingArray[inputArray[i]]] = inputArray[i];
        }
        System.out.println();
        displayArr(res);

    }

    static void displayArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 1, 5, 6, 7, 7, 1, 0, 1, 9};
        sortFunction(arr);
    }
}
