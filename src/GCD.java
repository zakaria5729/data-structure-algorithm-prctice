import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        System.out.println(gcd(n1, n2));
    }


    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }

        return gcd(n2, n1 % n2);
    }

//    static int gcd1(int n1, int n2) {
//        if(n1 % n2 == 0) return n2;
//        if (n2 % n1 == 0) return n1;
//
//        int greatestDivisor = 1;
//
//        for (int i = 2; i <= n1 && i <= n2; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                greatestDivisor = i;
//            }
//        }
//
//        return greatestDivisor;
//    }

//    static int gcd2(int n1, int n2) {
//        if(n1 % n2 == 0) return n2;
//        if (n2 % n1 == 0) return n1;
//
//        List<Integer> firstDivisors = new ArrayList<>();
//
//        for (int i = 1; i <= n1; i++) {
//            if (n1 % i == 0) {
//                firstDivisors.add(i);
//            }
//        }
//
//        int greatestDivisor = 1;
//        for (int i = 1; i <= n2; i++) {
//            if (n2 % i == 0 && firstDivisors.contains(i) && i > greatestDivisor) {
//                greatestDivisor = i;
//            }
//        }
//
//        return greatestDivisor;
//    }
}
