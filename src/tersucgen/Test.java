package tersucgen;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = klavye.nextInt();

        // Dış döngü satır sayısını kontrol eder (n'den 1'e doğru geri gider)
        for (int i = n; i >= 1; i--) {

            // 1. İç döngü: Boşlukları basar
            // Satır azaldıkça boşluk artmalı ki üçgen ortalansın
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // 2. İç döngü: Yıldızları basar
            // Yıldız sayısı (2n-1) formülüne göre belirlenir
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Bir alt satıra geçiş
            System.out.println();
        }

        klavye.close();
    }
}
