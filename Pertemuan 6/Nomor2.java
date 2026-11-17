
package Pertemuan6;


public class Nomor2 {
    public static void main(String[] args) {

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";

                System.out.println("Indeks: " + i);
                System.out.println("Nilai baru: " + mobil[i]);
            }
        }
    }
}
