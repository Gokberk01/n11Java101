package arrays.enbuyukenkucuk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int input = scanner.nextInt();

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(list);

        // Başlangıç değerlerini dizinin dış sınırlarından veya anlamlı bir noktadan seçiyoruz
        int minNearest = list[0];
        int maxNearest = list[list.length - 1];

        for (int i : list) {
            // Eğer dizideki sayı, girilen sayıdan küçükse;
            // sıralı gittiğimiz için her seferinde daha yakına güncellenir.
            if (i < input) {
                minNearest = i;
            }

            // Eğer dizideki sayı, girilen sayıdan büyükse;
            // sıralı dizide karşılaştığımız ilk büyük sayı en yakın olandır.
            if (i > input) {
                maxNearest = i;
                break; // İlk büyük sayıyı bulduğumuzda döngüden çıkabiliriz.
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxNearest);
    }
}
