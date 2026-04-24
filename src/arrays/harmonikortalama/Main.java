package arrays.harmonikortalama;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;

        // Harmonik Seriyi hesaplıyoruz: (1/1 + 1/2 + 1/3 + 1/4 + 1/5)
        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += (1.0 / numbers[i]);
        }

        // Harmonik Ortalama: Eleman Sayısı / Harmonik Seri
        double harmonicAverage = numbers.length / harmonicSeries;

        System.out.println("Dizideki Elemanların Harmonik Ortalaması: " + harmonicAverage);
    }
}
