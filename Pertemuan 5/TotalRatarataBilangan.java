
package Pertemuan5;

import java.util.Scanner;
public class TotalRatarataBilangan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, angka, total = 0;
        double rataRata;

        System.out.print("Masukkan banyak bilangan: ");
        jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();

            total += angka;
        }

        rataRata = (double) total / jumlah;

        System.out.println("Total bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
