package asalsayilar;

public class Test {
    public static void main(String[] args) {
        // 1 ile 100 arasındaki sayıları dönen dış döngü
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Sayıyı başlangıçta asal kabul ediyoruz

            // Sayının asal olup olmadığını kontrol eden iç döngü
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // Eğer herhangi bir sayıya tam bölünürse asal değildir
                    break; // Daha fazla kontrol etmeye gerek yok, döngüden çık
                }
            }

            // Eğer isPrime hala true ise, sayı asaldır ve yazdırılır
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

