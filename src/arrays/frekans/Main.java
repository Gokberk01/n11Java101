package arrays.frekans;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        // Ziyaret edilen indisleri takip etmek için bir dizi
        // Başlangıçta hepsi false (ziyaret edilmedi)
        boolean[] visited = new boolean[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {
            // Eğer bu eleman daha önce sayıldıysa atla
            if (visited[i]) {
                continue;
            }

            int count = 1; // Kendisi olduğu için 1'den başlıyoruz
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    visited[j] = true; // Tekrar eden elemanı işaretle
                    count++;
                }
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
