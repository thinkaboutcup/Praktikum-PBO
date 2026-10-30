
package Pertemuan5;


public class ForeachArray {
     public static void main(String[] args) {

        String[] namaBuah = {
            "rambutan",
            "Melon",
            "Mangga",
            "Pisang",
            "Anggur"
        };

        System.out.println("Daftar Nama Buah:");

        for (String buah : namaBuah) {
            System.out.println(buah);
        }

    }
}
