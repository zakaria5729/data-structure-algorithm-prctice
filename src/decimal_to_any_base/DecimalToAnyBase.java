package decimal_to_any_base;

import java.util.Scanner;

public class DecimalToAnyBase {

    static String hexString = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int base = scanner.nextInt();

        printDecimalToAnyBase(num, base);
    }

    static void printDecimalToAnyBase(int num, int base) {
        if (num == 0) {
            return;
        }

        printDecimalToAnyBase(num / base, base);
        int reminder = num % base;

        if (base == 16) {
            System.out.print(hexString.charAt(reminder));
        } else {
            System.out.print(reminder);
        }
    }
}
