package arrays.matristranspose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Matris boyutlarını kullanıcıdan alalım
        System.out.print("Satır sayısı (k): ");
        int rows = scan.nextInt();
        System.out.print("Sütun sayısı (n): ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        // 2. Matris elemanlarını dolduralım
        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // 3. Transpoze matrisi oluşturalım (Boyutlar yer değiştirir: n x k)
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Temel kural: Satır ve sütun indislerini takas et
                transpose[j][i] = matrix[i][j];
            }
        }

        // 4. Sonuçları ekrana yazdıralım
        System.out.println("\nMatris :");
        printMatrix(matrix);

        System.out.println("\nTranspoze :");
        printMatrix(transpose);

        scan.close();
    }

    // Matrisi düzgün formatta yazdırmak için yardımcı metot
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }
    }
}
