package arrays.tekraredencift;

public class Main {
    // Yardımcı metot: Bir sayının dizide olup olmadığını kontrol eder
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 4, 4, 10};
        int[] duplicateEvens = new int[list.length]; // Tekrar edenleri saklayacağımız dizi
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                // Kendisi dışındaki indislerde aynı sayı var mı?
                // Sayı çift mi?
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    // Bu sayı daha önce listeye eklendi mi?
                    if (!isFind(duplicateEvens, list[i])) {
                        duplicateEvens[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        // Sonuçları yazdıralım (Sadece eklenen elemanları gör)
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int value : duplicateEvens) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}