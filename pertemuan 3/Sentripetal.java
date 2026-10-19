package pertemuan3;

import java.util.Scanner;

public class Sentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Massa benda (kg): ");
        double m = input.nextDouble();
        System.out.print("Kecepatan (m/s): ");
        double v = input.nextDouble();
        System.out.print("Jari-jari (m): ");
        double r = input.nextDouble();
        double gaya = (m * v * v) / r;
        System.out.println("Gaya sentripetal = " + gaya + " Newton");

        input.close();
    }
}
