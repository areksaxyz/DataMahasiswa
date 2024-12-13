package DoWhile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do while");

//  do {
//      aksi
//  } while (kondisi);

        System.out.println("Ini adalah awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Do While ke-" +a);

            if (a == 1) {
                kondisi = true;
            }
        }while(kondisi);
        System.out.println("ini adalah akhir");
    }
} 