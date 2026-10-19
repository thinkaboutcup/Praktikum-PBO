package pertemuan3;

import java.io.*;

public class TotalBuah {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int manggaAwal = 70;
        int manggaBusuk = 15;
        int manggaBaik = manggaAwal - manggaBusuk;

        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = jumlahTetangga * jambuPerTetangga;

        int totalBuahDibeli = manggaBaik + totalJambu;

        System.out.println("--- PERHITUNGAN TOTAL BUAH IBU SISCA ---");
        System.out.println("Mangga bersih (setelah dikurangi busuk): " + manggaBaik + " pcs");
        System.out.println("Total buah jambu untuk tetangga: " + totalJambu + " pcs");
        System.out.println("Total keseluruhan buah yang dibeli: " + totalBuahDibeli + " pcs");
    }
}
