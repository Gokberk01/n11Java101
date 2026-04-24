package manavkasasi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenleri ve sabit fiyatları tanımlıyoruz
        Scanner input = new Scanner(System.in);
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;

        // Kullanıcıdan kilogram değerlerini alıyoruz
        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();

        // Toplam tutarı hesaplıyoruz
        toplamTutar = (armutKg * armutFiyat) +
                (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) +
                (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
