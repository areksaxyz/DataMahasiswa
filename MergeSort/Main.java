package MergeSort;
import java.util.Scanner;

public class Main {

    public static void sort(int[] a, int low, int high) {
        int N = high - low;
        if (N <= 1) return;

        int mid = low + N / 2;

        sort(a, low, mid);
        sort(a, mid, high);

        int[] temp = new int[N];

        int i = low, j = mid;

        for (int k = 0; k < N; k++) {
            if (i == mid) {
                temp[k] = a[j++];
            } else if (j == high) {
                temp[k] = a[i++];
            } else if (a[j] < a[i]) {
                temp[k] = a[j++];
            } else {
                temp[k] = a[i++];
            }
        }

        for (int k = 0; k < N; k++) {
            a[low + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Test Merge Sort \n");
            System.out.println("Masukkan jumlah elemen integer:");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.println("\nMasukkan nilai elemen integer:");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            sort(arr, 0, n);

            System.out.println("\nElemen integer setelah diurutkan:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}