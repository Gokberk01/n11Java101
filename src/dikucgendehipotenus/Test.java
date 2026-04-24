package dikucgendehipotenus;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Kullanıcıdan veri girişi almak için Scanner
        Scanner input = new Scanner(System.in);

        // --- BÖLÜM 1: Dik Üçgende Hipotenüs Bulma ---
        System.out.println("--- Hipotenüs Hesaplama ---");
        System.out.print("1. Dik Kenarı Giriniz: ");
        int a_dik = input.nextInt();
        System.out.print("2. Dik Kenarı Giriniz: ");
        int b_dik = input.nextInt();

        // Hipotenüs formülü: c^2 = a^2 + b^2
        double hipotenus = Math.sqrt((a_dik * a_dik) + (b_dik * b_dik));
        System.out.println("Hipotenüs Uzunluğu: " + hipotenus);

        System.out.println("\n---------------------------\n");

        // --- BÖLÜM 2: Üç Kenarı Verilen Üçgenin Alanını Bulma ---
        System.out.println("--- Üçgenin Alanını Hesaplama (Heron Formülü) ---");
        System.out.print("1. Kenar (a): ");
        double a = input.nextDouble();
        System.out.print("2. Kenar (b): ");
        double b = input.nextDouble();
        System.out.print("3. Kenar (c): ");
        double c = input.nextDouble();

        // Formül: u = (a+b+c) / 2
        double u = (a + b + c) / 2.0;

        // Alan formülü: Alan = √(u * (u-a) * (u-b) * (u-c))
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + (2 * u));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
