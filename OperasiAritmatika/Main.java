package OperasiAritmatika;

   public class Main // Dcoder di ganti sesuai nama main file
 {
   public static void main(String args[])
   { 
    System.out.println("NOB CODER HERE, NEW PROJECT");
    
    // Operasi Aritmatika
    int variable1 = 12;
    int variable2 = 5;
    int hasil;
    
    // 1. penjumlahan
    hasil = variable1 + variable2; // (12 + 5) 
    System.out.println(variable1+ " + " + variable2 + " = " + hasil);
    
     // 2. pengurangan
    hasil = variable1 - variable2; // (12 - 5) 
    System.out.printf("%d - %d = %d \n", variable1,variable2,hasil);
    
     // 3. perkalian 
    hasil = variable1 * variable2; // (12 x 5) 
    System.out.printf("%d x %d = %d \n", variable1,variable2,hasil);
    
     // 4. pembagian
    hasil = variable1 / variable2; // (12 : 5) 
    System.out.printf("%d / %d = %d \n", variable1,variable2,hasil);
    
     // 5. modulus (sisa pembagian)
    hasil = variable1 % variable2;
    System.out.printf("%d %% %d = %d \n", variable1,variable2,hasil);
    
    // contoh menggunakan Float
    float a = 6;
    float b = 5;
    float hasilFloat = a/b;
    System.out.println(a + " / " + b + " = " + hasilFloat);
    
   }
 }
