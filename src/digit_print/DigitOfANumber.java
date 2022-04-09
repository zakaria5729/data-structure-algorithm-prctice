package digit_print;

import java.util.Scanner;

public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        digitOfNumber(n);
    }

    static void digitOfNumber(int n) {
        int power = 1;
        int temp = n;

        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }

        temp = n;
        while (power != 0) {
            int digit = temp / power;
            System.out.println(digit);

            temp = temp % power;
            power = power / 10;
        }
    }

    static void digitOfNumberRecursive(int n) {
        if (n <= 0) {
            return;
        }

        digitOfNumber(n / 10);
        System.out.println(n % 10);
    }
}
