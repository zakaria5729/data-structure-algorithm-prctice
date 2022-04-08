package fibonacci_numbers;

import java.util.*;

public class FibonacciNumbersTillN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printFibonacciNormalWay(n);
        System.out.println();
        printFibonacciGoodWay(n);
    }

    static void printFibonacciNormalWay(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        }

        List<Integer> fibo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibo.add(i);
                System.out.println(i);
            } else {
                int fib = fibo.get(i-2) + fibo.get(i-1);
                fibo.add(fib);
                System.out.println(fib);
            }
        }
    }

    static void printFibonacciGoodWay(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        }

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
