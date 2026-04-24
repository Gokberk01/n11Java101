package enbuyukenkucuk;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        // n değeri 1'den küçükse işlem yapılamaz
        if (n <= 0) {
            System.out.println("Lütfen pozitif bir adet giriniz.");
            return;
        }

        int i = 1;
        int sayi;
        // Başlangıçta karşılaştırma yapabilmek için en küçük ve en büyük değerleri
        // Java'nın alabileceği en uç değerlere veya ilk sayıya eşitlemeliyiz.
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            // En büyük sayıyı güncelleme
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            // En küçük sayıyı güncelleme
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            i++;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        input.close();
    }
}
