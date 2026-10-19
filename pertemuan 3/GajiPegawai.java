package pertemuan3;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan: ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        double gajiPokok = 2000000;
        double tunjanganJabatan = 300000;
        double tunjanganIstri = 200000;
        double tunjanganAnak = 150000;

        double totalGaji = gajiPokok + tunjanganJabatan
                         + tunjanganIstri + tunjanganAnak;

        double pajak = 0.10 * (gajiPokok + tunjanganJabatan
                              + tunjanganIstri);

        double gajiBersih = totalGaji - pajak;

        System.out.println("\n=== DATA KARYAWAN ===");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("Total Gaji   : Rp" + totalGaji);
        System.out.println("Pajak        : Rp" + pajak);
        System.out.println("Gaji Bersih  : Rp" + gajiBersih);

        input.close();
    }
}
