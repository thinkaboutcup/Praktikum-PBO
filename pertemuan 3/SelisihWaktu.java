package pertemuan3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Waktu Pertama (Jam Menit Detik):");
        int jam1 = input.nextInt();
        int menit1 = input.nextInt();
        int detik1 = input.nextInt();

        System.out.println("Masukkan Waktu Kedua (Jam Menit Detik):");
        int jam2 = input.nextInt();
        int menit2 = input.nextInt();
        int detik2 = input.nextInt();

        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int jam = selisihDetik / 3600;
        int sisa = selisihDetik % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Selisih Waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik.");
    }
}
