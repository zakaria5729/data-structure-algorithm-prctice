    import java.util.Scanner;

    public class PrimeFactorisation {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            if (n == 1) {
                System.out.println(1);
            }

            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    n = n / i;
                    System.out.println(i);
                }
            }

            if (n != 1) {
                System.out.println(n);
            }
        }
    }
