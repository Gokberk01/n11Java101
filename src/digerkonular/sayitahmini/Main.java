package digerkonular.sayitahmini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        // Test için açık bırakılabilir: System.out.println("Gizli Sayı: " + number);

        System.out.println("0-100 Arası Sayı Tahmin Oyununa Hoş Geldiniz!");

        while (right < 5) {
            System.out.print((right + 1) + ". tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("UYARI: Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Gizli sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
            System.out.println("-------------------------------------------");
        }

        if (!isWin) {
            System.out.println("\nMaalesef Kaybettiniz!");
            System.out.println("Gizli sayı şuydu: " + number);

            // Sadece yapılan tahminleri göster (sıfırları temizle)
            int[] actualGuesses = Arrays.copyOfRange(wrong, 0, right);
            System.out.println("Yaptığınız Tahminler : " + Arrays.toString(actualGuesses));
        }

        input.close();
    }
}