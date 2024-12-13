package AlgoritmaInsertionSort;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nomor = new int[1024];
        int menu = 0, z = 0, temp;
        Scanner in = new Scanner(System.in);

        while (menu != 4) {
            System.out.print("1. Input\n2. View\n3. Sort\n4. Exit\n: ");
            menu = in.nextInt();

            if (menu == 1) {
                z++;
                System.out.print("Masukkan Nomor: ");
                nomor[z] = in.nextInt();
            } else if (menu == 2) {
                if (z < 1) {
                    System.out.println("Kosong");
                } else {
                    System.out.print("Data Sebelum Diurutkan: ");
                    for (int a = 1; a <= z; a++) {
                        System.out.print(nomor[a] + " ");
                    }
                    System.out.println("");
                }
            } else if (menu == 3) {
                if (z < 1) {
                    System.out.println("Kosong");
                } else {
                    System.out.println("Proses pengurutan...");
                    for (int a = 2; a <= z; a++) {
                        int b = a;
                        while (b > 1 && nomor[b - 1] > nomor[b]) {
                            temp = nomor[b];
                            nomor[b] = nomor[b - 1];
                            nomor[b - 1] = temp;
                            b--;
                        }
                    }
                    System.out.print("Data Setelah Diurutkan: ");
                    for (int a = 1; a <= z; a++) {
                        System.out.print(nomor[a] + " ");
                    }
                    System.out.println("");
                }
            } else if (menu == 4) {
                System.out.println("Keluar");
            } else {
                System.out.println("Pilihan salah");
            }
            System.out.println("");
            in.close();
        }
    }
}