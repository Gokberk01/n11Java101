package notortalamasıhesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner nesnesini oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // Değişkenleri tanımlıyoruz
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan sınav puanlarını sırasıyla istiyoruz
        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        // Toplamı hesaplayıp ders sayısına bölerek ortalamayı buluyoruz
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : " + sonuc);

        // Koşullu ifade ile geçme/kalma durumunu kontrol ediyoruz
        if (sonuc >= 60) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }

    }
}
