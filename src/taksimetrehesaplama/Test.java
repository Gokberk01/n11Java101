package taksimetrehesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Değişkenlerimizi tanımlıyoruz
        double km, perKm = 2.20, total, startPrice = 10.0;

        // Kullanıcıdan mesafe bilgisini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();

        // Toplam tutarı hesaplıyoruz (Açılış + KM başı ücret)
        total = startPrice + (km * perKm);

        // Eğer toplam tutar 20'den küçükse 20'ye yuvarla, değilse olduğu gibi bırak
        // Formül: (koşul) ? (doğruysa değer) : (yanlışsa değer)
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Taksimetre Tutarı: " + total + " TL");
    }
}
