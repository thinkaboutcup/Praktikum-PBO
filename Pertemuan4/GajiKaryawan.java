package Pertemuan4;

import java.util.Scanner;
public class GajiKaryawan {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nik, nama;
        int golongan, jumlahAnak;
        String status;

        double gajiPokok = 0;
        double tunjanganPasangan = 0;
        double tunjanganAnak;
        double totalTunjangan, gajiBersih;

        System.out.print("Masukkan NIK: ");
        nik = input.nextLine();

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Kode golongan (1-4): ");
        golongan = input.nextInt();
        input.nextLine();

        System.out.print("Status pernikahan (Menikah/Belum/Cerai): ");
        status = input.nextLine();

        System.out.print("Jumlah anak: ");
        jumlahAnak = input.nextInt();

        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                input.close();
                return;
        }

        if (status.equalsIgnoreCase("Menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        totalTunjangan = tunjanganPasangan + tunjanganAnak;
        gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n=== DATA GAJI KARYAWAN ===");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Gaji Pokok          : Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan  : Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak      : Rp" + tunjanganAnak);
        System.out.println("Total Tunjangan     : Rp" + totalTunjangan);
        System.out.println("Gaji Bersih         : Rp" + gajiBersih);

        input.close();
    }
}
