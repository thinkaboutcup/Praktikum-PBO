
package Pertemuan6;


public class Nomor1 {
     public static void main(String[] args) {

        int[] angka1 = new int[3];
        angka1[0] = 10;
        angka1[1] = 20;
        angka1[2] = 30;

        int[] angka2 = {40, 50, 60};

        int[] angka3 = new int[]{70, 80, 90};

        System.out.println("Array 1:");
        for (int a : angka1) {
            System.out.println(a);
        }

        System.out.println("Array 2:");
        for (int a : angka2) {
            System.out.println(a);
        }

        System.out.println("Array 3:");
        for (int a : angka3) {
            System.out.println(a);
        }
    }
}
