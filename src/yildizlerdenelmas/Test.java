package yildizlerdenelmas;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz (Yükseklik) : ");
        int n = klavye.nextInt();

        // 1. KISIM: Elmasın Üst Yarısı (Artan Kısım)
        for (int i = 1; i <= n; i++) {
            // Boşluklar için döngü
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar için döngü (2n-1 kuralı)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. KISIM: Elmasın Alt Yarısı (Azalan Kısım)
        for (int i = n - 1; i >= 1; i--) {
            // Boşluklar için döngü
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar için döngü
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        klavye.close();
    }
}
