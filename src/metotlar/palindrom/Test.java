package metotlar.palindrom;

import java.util.Scanner;

public class Test {
    // Bir sayinin palindrom olup olmadigini kontrol eden metot
    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        // Sayiyi tersine cevirme islemi
        while (temp != 0) {
            lastNumber = temp % 10; // Son basamagi al
            reverseNumber = (reverseNumber * 10) + lastNumber; // Yeni sayiya ekle
            temp /= 10; // Sayiyi bir basamak eksilt
        }

        // Orijinal sayi ile tersi esit mi?
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int inputNumber = input.nextInt();

        if (isPalindrom(inputNumber)) {
            System.out.println(inputNumber + " bir palindrom sayidir.");
        } else {
            System.out.println(inputNumber + " bir palindrom sayi degildir.");
        }

        input.close();
    }
}
