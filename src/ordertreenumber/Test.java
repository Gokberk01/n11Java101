package ordertreenumber;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. sayıyı (a) giriniz: ");
        a = input.nextInt();

        System.out.print("2. sayıyı (b) giriniz: ");
        b = input.nextInt();

        System.out.print("3. sayıyı (c) giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            // Eğer buraya düştüyse en küçük kesinlikle c'dir
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }

        input.close();
    }
}
