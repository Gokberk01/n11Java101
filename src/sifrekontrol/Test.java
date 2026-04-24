package sifrekontrol;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Varsayılan mevcut şifremiz
        String mevcutSifre = "java101";
        String girilenSifre, secim, yeniSifre;

        System.out.print("Lütfen şifrenizi giriniz: ");
        girilenSifre = input.nextLine();

        // 1. Adım: Şifre kontrolü
        if (girilenSifre.equals(mevcutSifre)) {
            System.out.println("Giriş Başarılı!");
        } else {
            // Şifre yanlışsa kullanıcıya soruyoruz
            System.out.println("Şifre Yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayir): ");
            secim = input.nextLine();

            // 2. Adım: Sıfırlama isteği kontrolü
            if (secim.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = input.nextLine();

                // 3. Adım: Yeni şifre eski şifre ile aynı mı kontrolü
                if (yeniSifre.equals(mevcutSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("İşlem sonlandırıldı.");
            }
        }

        input.close();
    }
}
