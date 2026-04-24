package ikininkuvvetleri;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        System.out.println("---- 4'ün Kuvvetleri ----");
        // i değişkeni 1'den başlar ve her seferinde 4 ile çarpılır
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("---- 5'in Kuvvetleri ----");
        // j değişkeni 1'den başlar ve her seferinde 5 ile çarpılır
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }

        input.close();
    }
}
