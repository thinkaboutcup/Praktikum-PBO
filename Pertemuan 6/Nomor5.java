
package Pertemuan6;

import java.util.Scanner;


public class Nomor5 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah baris matriks A: ");
        int barisA = input.nextInt();

        System.out.print("Jumlah kolom matriks A: ");
        int kolomA = input.nextInt();

        System.out.print("Jumlah baris matriks B: ");
        int barisB = input.nextInt();

        System.out.print("Jumlah kolom matriks B: ");
        int kolomB = input.nextInt();

        if (kolomA != barisB) {
            System.out.println("Matriks tidak dapat dikalikan!");
            return;
        }

        int[][] A = new int[barisA][kolomA];
        int[][] B = new int[barisB][kolomB];
        int[][] C = new int[barisA][kolomB];

        System.out.println("\nMasukkan matriks A:");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan matriks B:");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nHasil perkalian matriks:");

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
