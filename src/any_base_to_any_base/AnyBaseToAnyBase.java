package any_base_to_any_base;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine().toUpperCase();
        int base = scanner.nextInt();
        int base2 = scanner.nextInt();

        int decimal = getValue(num, base, base2);
        System.out.println(decimal);
    }

    static int getValue(String num, int base, int base2) {
        int decimal = anyBaseToDecimal(num, base);
        return getValueInBase(decimal, base2);
    }

    static int getValueInBase(int num, int base) {
        int value = 0;
        int power = 1;

        while (num > 0) {
            int reminder = num % base;
            num = num / base;
            value = value + (reminder * power);
            power *= 10;
        }

        return value;
    }

    static int anyBaseToDecimal(String num, int base) {
        String hexString = "0123456789ABCDEF";
        int value = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int actualNum = hexString.indexOf(c);

            value = (base * value) + actualNum;
        }

        return value;
    }
}
