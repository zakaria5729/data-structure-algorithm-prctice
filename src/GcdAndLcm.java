import java.util.Scanner;

public class GcdAndLcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int gcd = gcdByDivisionMethod(n1, n2);
//        int lcm = lcmByBruteForce(n1, n2);
        int lcm = (n1 * n2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int lcmByBruteForce(int n1, int n2) {
        int lcm = n1 > n2 ? n1 : n2; //Because LCM cannot be less than the largest number.

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }

            lcm++;
        }

        return lcm;
    }

    static int gcdByDivisionMethod(int n1, int n2) {
        while (n1 % n2 != 0) {
            int reminder = n1 % n2;
            n1 = n2;
            n2 = reminder;
        }

        return n2;
    }

    static int gcdByBruteForce(int n1, int n2) {
        if(n1 % n2 == 0) return n2;
        if (n2 % n1 == 0) return n1;

        int greatestDivisor = 1;

        for (int i = 2; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                greatestDivisor = i;
            }
        }

        return greatestDivisor;
    }

    static int gcdByRecursion(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return gcdByRecursion(n2, n1 % n2);
    }
}
