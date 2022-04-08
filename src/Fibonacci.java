import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //better approach
        int a = 0;
        int b = 1;
        System.out.println(a);

        if (n > 0) {
            System.out.println(b);

            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.println(c);

                a = b;
                b = c;
            }
        }
    }

//        List<Integer> fibo = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i == 1) {
//                fibo.add(i);
//                System.out.println(i);
//            } else {
//                int fib = fibo.get(i-2) + fibo.get(i-1);
//                fibo.add(fib);
//                System.out.println(fib);
//            }
//        }
//    }
}
