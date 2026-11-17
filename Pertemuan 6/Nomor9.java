
package Pertemuan6;


public class Nomor9 {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        // Perulangan pertama: For
        System.out.println("Menggunakan For:");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // Perulangan kedua: Enhanced For
        System.out.println("\nMenggunakan Enhanced For:");

        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}
