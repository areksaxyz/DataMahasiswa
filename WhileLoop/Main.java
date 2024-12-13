package WhileLoop;

public class Main {
    public static void main(String[] args) {
//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal Program");
        while (kondisi) {

            System.out.println("While loop" + a);
            a++;
            if (a == 10) {
                kondisi = false;
            }
        }
}
}