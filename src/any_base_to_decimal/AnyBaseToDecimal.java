package any_base_to_decimal;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine().toUpperCase();
        int base = scanner.nextInt();

        int decimal = anyBaseToDecimalGoodWay(num, base);
        System.out.println(decimal);
    }

    static int anyBaseToDecimalNormalWay(String n, int base) {
        int num = Integer.parseInt(n);
        int power = 0;
        int value = 0;

        while (num > 0) {
            int reminder = num % 10;
            value += reminder * Math.pow(base, power);
            power++;
            num /= 10;
        }

        return value;
    }

    static int anyBaseToDecimalGoodWay(String num, int base) {
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
