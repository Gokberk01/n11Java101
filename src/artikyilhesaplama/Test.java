package artikyilhesaplama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        // Artık yıl hesaplama mantığı
        if (yil % 4 == 0) {
            // Yıl 4'ün katıysa 100'ün katı olup olmadığına bakılır
            if (yil % 100 == 0) {
                // 100'ün katıysa sadece 400'e bölünürse artık yıldır
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır !");
                } else {
                    System.out.println(yil + " bir artık yıldır değildir !");
                }
            } else {
                // 4'ün katı olup 100'ün katı değilse kesinlikle artık yıldır
                System.out.println(yil + " bir artık yıldır !");
            }
        } else {
            // 4'ün katı değilse zaten artık yıl olamaz
            System.out.println(yil + " bir artık yıldır değildir !");
        }

        input.close();
    }
}
