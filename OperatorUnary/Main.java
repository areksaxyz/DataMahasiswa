package OperatorUnary;

    public class Main {
    public static void main(String args[]) {
        System.out.println("NOB CODER HERE, NEW PROJECT");

        // Unary = operasi yang dilakukan pada satu variabel
        // Unary + dan -
        int angka = 1;
        System.out.printf("unary '+' %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-' %d menjadi %d\n", angka, -angka);

        // Unary Decrement dan Increment
        // Increment
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        // Decrement
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        // Prefix
        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);

        // Postfix
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", b);

        // Unary boolean dengan ! untuk negasi
        boolean kipli = true;
        System.out.println("nilai boolean = " + kipli);
        System.out.println("nilai boolean setelah negasi = " + !kipli);
    }
}
