package digit_count;

import java.util.Scanner;

public class CountDigitsInNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = countDigitByWhileLoop(n);
        System.out.println(count);
    }

    static int countDigitByWhileLoop(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    static int countDigitByForLoop(int n) {
        int count = 0;

        for (; n != 0; ) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
