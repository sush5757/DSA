
class Searching1 {

    public static int unSortedArrLinear(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;

    }

    public static int binarySearchRecursion(int[] arr, int key, int left, int right) {
        if (left >= right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearchRecursion(arr, key, mid + 1, right);
        } else {
            return binarySearchRecursion(arr, key, left, mid - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 42, 10, 40, 4, 5, 60, 90, 2};
        int res = unSortedArrLinear(arr, 60);

        System.out.println("Key Found on index using linear : " + res);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res2 = binarySearch(arr2, 9);

        System.out.println("Key Found on index using binary : " + res2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int high = arr3.length;

        int res3 = binarySearchRecursion(arr3, 9, 0, high);

        System.out.println("Key Found on index using binary recursion : " + res3);

    }
}
