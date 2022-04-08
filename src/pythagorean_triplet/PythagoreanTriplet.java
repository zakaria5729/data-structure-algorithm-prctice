package pythagorean_triplet;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int temp;

        if (n2 > n1 && n2 > n3) {
            temp = n2;
            n2 = n1;
            n1 = temp;

        } else if (n3 > n1 && n3 > n2) {
            temp = n3;
            n3 = n1;
            n1 = temp;
        }

        System.out.println((n1 * n1) == ((n2 * n2) + (n3 * n3)));
    }
}
