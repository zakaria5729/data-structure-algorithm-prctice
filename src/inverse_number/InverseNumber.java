package inverse_number;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inverse = 0;
        int position = 1;

        while (n != 0) {
            int digit = n % 10;
            int inverseDigit = position;

            inverse = inverse + (inverseDigit * (int) Math.pow(10, digit - 1));

            n /= 10;
            position++;
        }

        System.out.println(inverse);
    }
}
