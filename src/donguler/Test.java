package donguler;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, toplam = 0, adet = 0;

        System.out.print("Sınır sayısını giriniz: ");
        sayi = input.nextInt();

        // 0'dan girilen sayıya kadar döngü kuruyoruz
        for (int i = 0; i <= sayi; i++) {
            // Sayının hem 3'e hem de 4'e tam bölünme durumu
            if (i % 3 == 0 && i % 4 == 0) {
                // 0'ı ortalamaya dahil etmek istemiyorsan i > 0 kontrolü ekleyebilirsin
                if (i != 0) {
                    toplam += i;
                    adet++;
                }
            }
        }

        // 0'a bölünme hatasını engellemek için kontrol
        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Bu aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }

        input.close();
    }
}
