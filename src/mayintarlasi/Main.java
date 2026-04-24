package mayintarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r, c;

        System.out.println("--- Mayın Tarlası Ayarları ---");
        while (true) {
            System.out.print("Satır sayısını giriniz: ");
            r = scan.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            c = scan.nextInt();

            if (r >= 2 && c >= 2) {
                break;
            } else {
                System.out.println("Hata: Minimum 2x2 boyutunda matris girmelisiniz!");
            }
        }

        MineSweeper mine = new MineSweeper(r, c);
        mine.run();
    }
}