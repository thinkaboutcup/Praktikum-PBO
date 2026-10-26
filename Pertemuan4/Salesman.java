
package Pertemuan4;

import java.util.Scanner;
public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double penjualan, uangJasa, komisi, pendapatan;

        System.out.print("Masukkan jumlah penjualan: Rp");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            uangJasa = 0;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        pendapatan = uangJasa + komisi;

        System.out.println("\n=== PENDAPATAN SALESMAN ===");
        System.out.println("Jumlah Penjualan : Rp" + penjualan);
        System.out.println("Uang Jasa        : Rp" + uangJasa);
        System.out.println("Komisi           : Rp" + komisi);
        System.out.println("Total Pendapatan : Rp" + pendapatan);

        input.close();
    }
}
