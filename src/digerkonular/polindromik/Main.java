package digerkonular.polindromik;

import java.util.Scanner;

public class Main {
    // Performanslı yöntem
    static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Büyük-küçük harf duyarlılığını kaldırır
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' palindromik bir kelimedir.");
        } else {
            System.out.println("'" + word + "' palindromik bir kelime değildir.");
        }

        input.close();
    }
}
