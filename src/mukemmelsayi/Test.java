package mukemmelsayi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int total = 0;

        // Sayının kendisi hariç pozitif tam sayı çarpanlarını buluyoruz
        // Bu yüzden döngü 1'den başlar ve sayıdan (number) küçük olana kadar devam eder
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        // Çarpanların toplamı sayının kendisine eşit mi kontrol ediyoruz
        if (total == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

        input.close();
    }
}
