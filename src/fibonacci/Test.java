package fibonacci;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        // Serinin ilk iki sayısı sabittir
        int n1 = 0, n2 = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");

            // Bir sonraki sayıyı hesaplıyoruz
            int toplam = n1 + n2;

            // Değişkenleri kaydırıyoruz (Güncelleme)
            n1 = n2;
            n2 = toplam;
        }

        input.close();
    }
}
