package negatifdeger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int toplam = 0;

        // Tek bir sayı girilene kadar döngü devam eder
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();

            // Sayının çift ve 4'ün katı olma durumu kontrolü
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }

        } while (n % 2 == 0); // Sayı çift olduğu sürece döngüye devam et

        System.out.println("Toplam: " + toplam);

        input.close();
    }
}
