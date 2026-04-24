package mayintarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    String[][] map;
    String[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int success = 0;
        prepareGame();
        // System.out.println("Mayınların Konumu");
        // print(map); // Test için mayın konumlarını görmek istersen açabilirsin
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        while (game) {
            print(board);
            System.out.print("Satır Giriniz : ");
            int row = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scan.nextInt();

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat! Lütfen sınırlar dahilinde giriniz.");
                continue;
            }

            if (!board[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (map[row][col].equals("*")) {
                game = false;
                System.out.println("Game Over!!");
            } else {
                checkMine(row, col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler! Oyunu Kazandınız !");
                    print(board);
                    break;
                }
            }
        }
    }

    // Komşu hücrelerdeki mayınları sayan metot
    public void checkMine(int r, int c) {
        int count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i < 0 || j < 0 || i >= rowNumber || j >= colNumber) {
                    continue;
                }
                if (map[i][j].equals("*")) {
                    count++;
                }
            }
        }
        board[r][c] = String.valueOf(count);
    }

    // Mayınları yerleştirme ve board'u hazırlama
    public void prepareGame() {
        int randRow, randCol, count = 0;
        // Tüm alanları önce "-" ile doldur
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }

        // Rastgele elemanSayisi / 4 kadar mayın yerleştir
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (!map[randRow][randCol].equals("*")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    // Matrisi ekrana basma metodu
    public void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
