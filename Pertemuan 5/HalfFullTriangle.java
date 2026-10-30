
package Pertemuan5;

import java.util.Scanner;

public class HalfFullTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan tinggi segitiga: ");
        n = input.nextInt();

        System.out.println("\nHalf Triangle:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle:");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
