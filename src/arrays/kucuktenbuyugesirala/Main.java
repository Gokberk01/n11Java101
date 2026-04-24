package arrays.kucuktenbuyugesirala;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Dizinin boyutunu kullanıcıdan alıyoruz
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        // Kullanıcının girdiği boyuta göre dizi oluşturuluyor
        int[] list = new int[n];

        // 2. Dizinin elemanlarını kullanıcıdan alıyoruz
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }

        // 3. Arrays sınıfını kullanarak diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(list);

        // 4. Sonucu ekrana yazdırıyoruz
        System.out.print("Sıralama : ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
