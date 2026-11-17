
package Pertemuan6;

import java.util.Scanner;

class AnakThread extends Thread {

    private int nomor;

    public AnakThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        System.out.println("Thread ke-" + nomor
                + " sedang berjalan.");
    }
}
public class Nomor8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah thread harus lebih dari 0.");
            input.close();
            return;
        }

        AnakThread[] threads = new AnakThread[jumlah];

        for (int i = 0; i < jumlah; i++) {
            threads[i] = new AnakThread(i + 1);
            threads[i].start();
        }

        input.close();
    }
}
