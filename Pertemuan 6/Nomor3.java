
package Pertemuan6;

import java.util.Arrays;
import java.util.Scanner
        
public class Nomor3 {
     public static void main(String[] args) {

         try (Scanner input = new Scanner(System.in)) {
             System.out.print("Masukkan jumlah elemen: ");
             int n = input.nextInt();
             
             int[] angka = new int[n];
             
             int jumlah = 0;
             int genap = 0;
             int ganjil = 0;
             int terbesar;
             int terkecil;
             
             for (int i = 0; i < n; i++) {
                 System.out.print("Angka ke-" + (i + 1) + ": ");
                 angka[i] = input.nextInt();
                 
                 jumlah += angka[i];
                 
                 if (angka[i] % 2 == 0) {
                     genap += angka[i];
                 } else {
                     ganjil += angka[i];
                 }
             }
             
             terbesar = angka[0];
             terkecil = angka[0];
             
             for (int i = 0; i < n; i++) {
                 if (angka[i] > terbesar) {
                     terbesar = angka[i];
                 }
                 
                 if (angka[i] < terkecil) {
                     terkecil = angka[i];
                 }
             }
             
             double rataRata = (double) jumlah / n;
             
             System.out.println("\n=== HASIL ARRAY ===");
             System.out.println("Nilai terbesar: " + terbesar);
             System.out.println("Nilai terkecil: " + terkecil);
             System.out.println("Jumlah semua: " + jumlah);
             System.out.println("Rata-rata: " + rataRata);
             System.out.println("Jumlah bilangan genap: " + genap);
             System.out.println("Jumlah bilangan ganjil: " + ganjil);
             
             if (jumlah % 2 == 0) {
                 System.out.println("Hasil penjumlahan: Genap");
             } else {
                 System.out.println("Hasil penjumlahan: Ganjil");
             }
             
             Arrays.sort(angka);
             
             System.out.println("Array setelah diurutkan: "
                     + Arrays.toString(angka));
         }
    }
}
