package pertemuan3;

import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out);

        output.writeBytes("Nama: ");
        String nama = input.readLine();

        output.writeBytes("Total Belanja: ");
        double belanja = Double.parseDouble(input.readLine());

        output.writeBytes("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        output.writeBytes("Bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        double potongan = belanja * diskon / 100;
        double total = belanja - potongan;
        double kembalian = bayar - total;

        output.writeBytes("\n=== STRUK BELANJA ===\n");
        output.writeBytes("Nama       : " + nama + "\n");
        output.writeBytes("Total Awal : Rp" + belanja + "\n");
        output.writeBytes("Diskon     : Rp" + potongan + "\n");
        output.writeBytes("Total      : Rp" + total + "\n");
        output.writeBytes("Bayar      : Rp" + bayar + "\n");
        output.writeBytes("Kembalian  : Rp" + kembalian + "\n");
        output.flush();
    }
}
