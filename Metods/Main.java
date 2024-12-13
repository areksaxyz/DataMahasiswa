package Metods;

class Mahasiswa {
    // Data Member
    String Nama;
    String Nim;

    // Constuctor
    Mahasiswa(String inputNama, String inputNim) {
        this.Nama = inputNama;
        this.Nim = inputNim;
    }

    // Methods tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("Nim : " + this.Nim);
    }
    
    // Methods tanpa return dan tanpa parameter
    void setNama(String nama) {
        this.Nama = nama;
    }

    // Methods dengan return tapi tanpa parameter
    String getNama(){
        return this.Nama;
    }
    
    String getNim(){
        return this.Nim;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa = new Mahasiswa ("Kipli","24552011234");
        System.out.println(Mahasiswa.Nama);
        System.out.println(Mahasiswa.Nim);
        // Method
        Mahasiswa.show();
        Mahasiswa.setNama("Ucup");
        Mahasiswa.show();
        System.out.println(Mahasiswa.getNama());
        System.out.println(Mahasiswa.getNim());
    }
}