package harmonik;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        double result = 0.0;

        // Döngü 1'den başlayıp kullanıcının girdiği n sayısına kadar devam eder
        for (double i = 1; i <= n; i++) {
            // Her adımda 1/i değerini sonuca ekler
            result += (1 / i);
        }

        System.out.println("Harmonik Seri Toplamı: " + result);

        input.close();
    }
}
