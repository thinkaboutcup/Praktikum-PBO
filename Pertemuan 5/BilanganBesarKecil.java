
package Pertemuan5;

import java.util.Scanner;
public class BilanganBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
