package kdvtutarihesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Kullanıcıdan veri girişi almak için Scanner
        Scanner input = new Scanner(System.in);

        // Değişkenleri tanımlıyoruz
        double tutar, kdvOran, kdvTutari, kdvliFiyat;

        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        // Koşullu ifade ile KDV oranını belirliyoruz
        if (tutar > 0 && tutar <= 1000) {
            kdvOran = 0.18; // %18
        } else if (tutar > 1000) {
            kdvOran = 0.08; // %8
        } else {
            kdvOran = 0; // Hatalı (negatif) giriş durumu için
            System.out.println("Lütfen geçerli bir tutar giriniz!");
        }

        // Hesaplamalar
        kdvTutari = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutari;

        // Sonuçları ekrana bastırıyoruz
        System.out.println("KDV'siz Fiyat: " + tutar + " TL");
        System.out.println("KDV Oranı: %" + (kdvOran * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
    }
}
