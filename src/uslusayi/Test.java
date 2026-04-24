package uslusayi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k;
        long toplam = 1; // Çarpma işlemi yapacağımız için başlangıç değeri 1 olmalı

        System.out.print("Üssü alınacak sayı (Taban): ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı (Kuvvet): ");
        k = input.nextInt();

        // For döngüsü ile hesaplama
        // i değişkeni 1'den başlar ve üs değerine (k) ulaşana kadar döner
        for (int i = 1; i <= k; i++) {
            toplam *= n; // toplam = toplam * n
        }

        System.out.println("Sonuç: " + toplam);

        input.close();
    }
}
