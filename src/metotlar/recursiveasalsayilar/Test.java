package metotlar.recursiveasalsayilar;

import java.util.Scanner;

public class Test {
    // Recursive asal sayi kontrol metodu
    // n: kontrol edilen sayi, i: bolen adayi
    static boolean isPrime(int n, int i) {
        // Durma kosulu 1: Sayi 2'den kucukse asal degildir
        if (n < 2) {
            return false;
        }
        // Durma kosulu 2: Bolen adayi sayinin kendisine ulastiysa asaldir
        if (n == i) {
            return true;
        }
        // Durma kosulu 3: Sayi mevcut i degerine tam bolunuyorsa asal degildir
        if (n % i == 0) {
            return false;
        }
        // Kendini cagirma: Bir sonraki bolen adayini kontrol et
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scan.nextInt();

        // Metodu 2'den baslatarak kontrol ediyoruz
        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        scan.close();
    }
}
