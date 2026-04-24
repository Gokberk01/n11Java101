package armstrong;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int tempNumber = number;
        int basValue;
        int result = 0;

        // Sayı 0 olana kadar basamaklarını parçalıyoruz
        while (tempNumber != 0) {
            // Sayının son basamağını alıyoruz (Örn: 1643 % 10 = 3)
            basValue = tempNumber % 10;

            // Bulduğumuz basamağı sonuca ekliyoruz
            result += basValue;

            // Sayıyı 10'a bölerek bir üst basamağa geçiyoruz (Örn: 1643 / 10 = 164)
            tempNumber /= 10;
        }

        System.out.println("Girdiğiniz sayının basamak sayıları toplamı: " + result);

        input.close();
    }
}
