package prime_number;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if(isPrimeBestWay(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrimeGoodWay(int val) {
        if(val == 0 || val == 1) return true;

        boolean isNotPrime = false;
        for (int i = 2; i <= val; i++) {

            if(val % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        return !isNotPrime;
    }

    static boolean isPrimeBetterWay(int val) {
        if(val == 0 || val == 1) return true;

        boolean isNotPrime = false;
        for (int i = 2; i <= val / 2; i++) {

            if(val % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        return !isNotPrime;
    }

    static boolean isPrimeBestWay(int val) {
        if(val == 0 || val == 1) return true;

        boolean isNotPrime = false;
        for (int i = 2; i <= Math.sqrt(val); i++) {

            if(val % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        return !isNotPrime;
    }
}
