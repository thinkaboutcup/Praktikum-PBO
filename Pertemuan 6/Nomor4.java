
package Pertemuan6;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.next();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();

            if (nilai[i] < 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("\n========== DAFTAR NILAI MAHASISWA ==========");
        System.out.printf("%-5s %-15s %-10s %-15s%n",
                "No", "Nama", "Nilai", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-15s %-10d %-15s%n",
                    (i + 1), nama[i], nilai[i], status[i]);
        }

        input.close();
    }
}
