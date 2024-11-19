
import java.util.Scanner;

public class FibIterative {

    static void fibSeries(int num) {
        int a = 0, b = 1, i;

        for (i = 0; i < num; i++) {
            System.out.println(a);
            int c = b + a;
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :");
        int num = sc.nextInt();

        fibSeries(num);

    }
}
