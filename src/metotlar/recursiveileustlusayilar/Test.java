package metotlar.recursiveileustlusayilar;

import java.util.Scanner;

public class Test {
    // Recursive (Ozyinelemeli) us alma metodu
    static int power(int base, int exponent) {
        // Durma kosulu (Base case): Her sayinin 0. kuvveti 1'dir.
        if (exponent == 0) {
            return 1;
        }
        // Islem mantigi: taban * (taban^(us-1))
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();

        System.out.print("Us degerini giriniz :");
        int exponent = scan.nextInt();

        // Metodu cagirma ve sonucu ekrana basma
        System.out.println("Sonuc : " + power(base, exponent));

        scan.close();
    }
}
