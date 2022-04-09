package digit_frequency;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int n = scn.nextInt();

        int counter = 0;

        while (input > 0) {
            if (input % 10 == n) {
                counter++;
            }

            input /= 10;
        }

        System.out.println(counter);
    }
}
