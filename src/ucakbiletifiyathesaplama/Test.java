package ucakbiletifiyathesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenlerin tanımlanması
        int mesafe, yas, yolculukTipi;
        double birimUcret = 0.10, normalTutar, yasIndirimi, indirimliTutar, gdIndirimi, toplamTutar;

        // Kullanıcıdan verilerin alınması
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        // 1. ADIM: Veri Doğrulama (Geçerlilik Kontrolü)
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            // 2. ADIM: Normal Tutar Hesaplama
            normalTutar = mesafe * birimUcret;

            // 3. ADIM: Yaş İndirimi Uygulama
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = normalTutar * 0.30;
            } else {
                yasIndirimi = 0;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            // 4. ADIM: Yolculuk Tipi İndirimi ve Toplam Tutar
            if (yolculukTipi == 2) {
                gdIndirimi = indirimliTutar * 0.20;
                // Gidiş-dönüş olduğu için indirimden sonra 2 ile çarpıyoruz
                toplamTutar = (indirimliTutar - gdIndirimi) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            // Sonucun ekrana yazdırılması
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else {
            // Hatalı veri girişi durumu
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
