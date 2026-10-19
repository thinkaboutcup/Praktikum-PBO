
package Pertemuan2;


public class KonversiSuhu {
  public static void main(String[] args) {
        double C = 10, F = 15, R = 5;
        double CtoF = C * 9 / 5 + 32;
        double FtoC = F - 32 * 5 / 9;
        double CtoR = C * 4 / 5;
        double RtoC = R * 5 / 4;
        double FtoR = F - 32 * 4 / 9;
        double RtoF = R * 9 / 4 + 32;
        
        System.out.println("Celsius ke Fahrenheit: " + CtoF);
        System.out.println("Fahrenheit ke Celsius: " + FtoC);
        System.out.println("Celsius ke Reamur: " + CtoR);
        System.out.println("Reamur ke Celsius: " + RtoC);
        System.out.println("Fahrenheit ke Reamur: " + FtoR);
        System.out.println("Reamur ke Fahrenheit: " + RtoF);
    }
}

