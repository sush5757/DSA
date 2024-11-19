
public class Fib {

    public static void cal(int num1, int num2, int n) {
        //recursion terminator
        if (n == 0) {
            return;
        }
        //logic
        int c = num1 + num2;
        System.out.print(" " + c);

        cal(num2, c, n - 1);

    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 10;
        System.out.print(num1 + " " + num2);

        cal(num1, num2, n);
        System.out.println();
    }
}
