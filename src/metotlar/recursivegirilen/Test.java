package metotlar.recursivegirilen;

import java.util.Scanner;

public class Test {

    // Sayiyi once azaltan, sinira ulasinca artiran recursive metot
    static void pattern(int n, int temp, boolean isDecreasing) {
        // Mevcut sayiyi ekrana yazdir
        System.out.print(temp + " ");

        // DURMA KOSULU: Sayi tekrar baslangic degerine ulastiysa ve artik artiyorsa bitir
        if (!isDecreasing && temp == n) {
            return;
        }

        // AZALMA ASAMASI
        if (isDecreasing) {
            // Sayi hala pozitifse 5 cikararak devam et
            if (temp > 0) {
                pattern(n, temp - 5, true);
            }
            // Sayi 0 veya negatif olduysa artma asamasina gec
            else {
                pattern(n, temp + 5, false);
            }
        }
        // ARTMA ASAMASI
        else {
            pattern(n, temp + 5, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scan.nextInt();

        System.out.print("Çıktısı : ");
        pattern(n, n, true);

        scan.close();
    }
}
