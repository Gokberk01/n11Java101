package faktoriyelhesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısı (n): ");
        int n = input.nextInt();

        System.out.print("Gruplanacak eleman sayısı (r): ");
        int r = input.nextInt();

        // n'in r'den küçük olması durumunda kombinasyon hesaplanamaz
        if (n >= r && n >= 0 && r >= 0) {

            /* Formül: n! / (r! * (n-r)!) */
            long nFaktoryel = faktoryelHesapla(n);
            long rFaktoryel = faktoryelHesapla(r);
            long nEksiRFaktoryel = faktoryelHesapla(n - r);

            long kombinasyon = nFaktoryel / (rFaktoryel * nEksiRFaktoryel);

            System.out.println("C(" + n + "," + r + ") Kombinasyonu: " + kombinasyon);

        } else {
            System.out.println("Hatalı veri girdiniz! n değeri r'den küçük veya negatif olamaz.");
        }

        input.close();
    }

    // Faktöriyel hesaplayan yardımcı metot
    public static long faktoryelHesapla(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}

