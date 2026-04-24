package ebobekok;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok;

        // EBOB Hesaplama: Küçük olan sayıdan geriye doğru kontrol ediyoruz
        int k = n1;
        if (n2 < n1) {
            k = n2;
        }

        int i = k;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break; // En büyüğü bulduğumuz için döngüyü bitiriyoruz
            }
            i--;
        }

        // EKOK Hesaplama: Formül üzerinden (n1 * n2) / EBOB
        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}
