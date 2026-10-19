package pertemuan3;

import java.util.Scanner;

public class MenghitungWaktu {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang dicetak: ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalLembar = input.nextInt();

        long totalDetik = (long) jumlahNovel * tebalLembar;

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n--- WAKTU PENGERJAAN PERCETAKAN ---");
        System.out.println("Total waktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");  
    }
}
