
package Pertemuan2;


public class JarakBumi {
    public static void main(String[] args) {
        double jarakBulan = 384400;
        double jarakMatahari = 152100000;
        double kecepatanCahaya = 300000;
        double waktuBulan = jarakBulan/kecepatanCahaya;
        double waktuMatahari = jarakMatahari/kecepatanCahaya;
        System.out.println("Waktu ke bulan : " + waktuBulan + "detik");
        System.out.println("Waktu ke matahari : " + waktuMatahari + "detik");
    }
}
