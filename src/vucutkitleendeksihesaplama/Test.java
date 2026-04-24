package vucutkitleendeksihesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner nesnesi
        Scanner input = new Scanner(System.in);

        // Değişkenlerimizi tanımlıyoruz
        double boy, kilo, vki;

        // Boy bilgisini metre cinsinden alıyoruz (Örn: 1,72)
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        // Kilo bilgisini alıyoruz
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        // Formül: Kilo / (Boy * Boy)
        vki = kilo / (boy * boy);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
