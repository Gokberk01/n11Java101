package dairealanihesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenleri ve sabitleri tanımlıyoruz
        Scanner input = new Scanner(System.in);
        double r, aci, pi = 3.14, alan, cevre, dilimAlan;

        // Kullanıcıdan yarıçap bilgisini alıyoruz
        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        r = input.nextDouble();

        // 1. Bölüm: Tüm Dairenin Alanı ve Çevresi
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.println("\n--- Daire Dilimi Hesaplama ---");

        // 2. Bölüm: Ödev - Daire Diliminin Alanı
        System.out.print("Merkez açısının ölçüsünü (alfa) giriniz: ");
        aci = input.nextDouble();

        // Formül: (pi * r^2 * alfa) / 360
        dilimAlan = (pi * (r * r) * aci) / 360;

        System.out.println(aci + " derecelik daire diliminin alanı: " + dilimAlan);
    }
}
