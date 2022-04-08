import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int temp = n;
        int numOfDigit = 0;

        while (temp > 0) {
            temp /= 10;
            numOfDigit++;
        }

        r = r % numOfDigit;

        if (r < 0) {
            r = r + numOfDigit;
        }

        int divider = 1;
        int multiplier = 1;

        for (int i = 1; i <= numOfDigit; i++) {
            if (i <= r) {
                divider *= 10;
            } else {
                multiplier *= 10;
            }
        }

        int quotient = n / divider;
        int remainder = n % divider;

        int value = (remainder * multiplier) + quotient;
        System.out.println(value);
    }
}
