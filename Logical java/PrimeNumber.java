
public class PrimeNumber {

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int[] primeNumberSeries(int count) {
        int[] arr = new int[count];

        for (int i = 2, j = 0; j < arr.length; i++) {
            if (isPrime(i)) {
                arr[j] = i;
                j++;
            }
        }

        return arr;

    }

    public static void main(String[] args) {

        int num = 13;
        int num2 = 12;

        System.out.println(num + " " + isPrime(num));
        System.out.println(num2 + " " + isPrime(num2));

        int[] a = primeNumberSeries(10);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
