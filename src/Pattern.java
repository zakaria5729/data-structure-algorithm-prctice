import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /*Pattern 10*/
        int stp = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.println("*");
                } else {
                    
                }
            }
        }

/*Pattern 9*/
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == j || i + j == n + 1) {
//                    System.out.print("*\t");
//                } else {
//                    System.out.print("\t");
//                }
//            }
//
//            System.out.println();
//        }

//        int nsp = n - 1;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < nsp; j++) {
//                System.out.print("\t");
//            }
//
//            System.out.print("*\t");
//
//            nsp--;
//            System.out.println();
//        }

//        int nsp2 = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < nsp2; j++) {
//                System.out.print("\t");
//            }
//
//            System.out.print("*\t");
//
//            nsp2++;
//            System.out.println();
//        }

//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print("\t");
//            }
//
//            System.out.print("*");
//            System.out.println();
//        }

//        int star = (n + 1) / 2;
//        int space = 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= star; j++) {
//                System.out.print("*\t");
//            }
//
//            for (int j = 1; j <= space; j++) {
//                System.out.print("\t");
//            }
//
//            for (int j = 1; j <= star; j++) {
//                System.out.print("*\t");
//            }
//
//            System.out.println();
//
//            if (i <= (n / 2)) {
//                space += 2;
//                star--;
//            } else {
//                star++;
//                space -= 2;
//            }
//        }

//        int star = 1;
//        int space = n / 2;

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= space; j++) {
//                System.out.print("\t");
//            }
//
//            for (int j = 1; j <= star; j++) {
//                System.out.print("*\t");
//            }
//
//            System.out.println();
//
//            if (i <= (n / 2)) {
//                space--;
//                star += 2;
//            } else {
//                star -= 2;
//                space++;
//            }
//        }

//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= n -i; j++) {
//                System.out.print("\t");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        int num = 10;
//        long factorial = multiplyNumbers(num);
//        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1) {
            System.out.println(num + " ------------");
            return num * multiplyNumbers(num - 1);
        } else {
            return 1;
        }
    }

//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n1 = scn.nextInt();
//        int n2 = scn.nextInt();
//        int n3 = scn.nextInt();
//
//        int temp;
//
//        if (n2 > n1 && n2 > n3) {
//            temp = n2;
//            n2 = n1;
//            n1 = temp;
//
//        } else if (n3 > n1 && n3 > n2) {
//            temp = n3;
//            n3 = n1;
//            n1 = temp;
//        }
//
//        System.out.println((n1 * n1) == ((n2 * n2) + (n3 * n3)));
//    }
}
