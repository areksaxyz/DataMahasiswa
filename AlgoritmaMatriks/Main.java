package AlgoritmaMatriks;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int i, j, m, n;
        
        Scanner scan = new Scanner(System.in);

        // Meminta ukuran matriks dari pengguna
        System.out.println("Masukan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.println("Masukan jumlah kolom matriks: ");
        n = scan.nextInt();

        // Membuat matriks sesuai ukuran yang dimasukkan
        int matriks1[][] = new int[m][n];
        int matriks2[][] = new int[m][n];
        int hasil[][] = new int[m][n];

        // Meminta input elemen untuk matriks pertama
        System.out.println("Masukan elemen matriks pertama: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("Elemen [%d][%d]: ", i+1, j+1);
                matriks1[i][j] = scan.nextInt();
            }
        }

        // Meminta input elemen untuk matriks kedua
        System.out.println("Masukan elemen matriks kedua: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("Elemen [%d][%d]: ", i+1, j+1);
                matriks2[i][j] = scan.nextInt();
            }
        }

        // Menampilkan hasil penjumlahan matriks
        System.out.println("Hasil Penjumlahan matriks: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println(); // pindah baris setelah setiap baris matriks
        }

        scan.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}
