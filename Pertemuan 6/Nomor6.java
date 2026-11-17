
package Pertemuan6;

import java.util.Scanner;

public class Nomor6 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException(
                    "Jumlah bilangan harus lebih dari 0!"
                );
            }

            int[] angka = new int[n];
            int jumlah = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextInt();

                jumlah += angka[i];
            }

            double rataRata = (double) jumlah / n;

            System.out.println("Jumlah: " + jumlah);
            System.out.println("Rata-rata: " + rataRata);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: "
                    + e.getMessage());
        }

        input.close();
    }
}
