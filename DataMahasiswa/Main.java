package DataMahasiswa;

class Mahasiswa{
    String Nama;
    String Nim;
    int Umur;
    String Jurusan;
    double IPK;
}

public class Main {
    public static void main(String[] args) throws Exception {

        // instalasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.Nama = "KIPLI";
        mahasiswa1.Nim = "24551120324";
        mahasiswa1.Umur = 21;
        mahasiswa1.Jurusan = "Informatika";
        mahasiswa1.IPK = 4.0;


        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.Nim);
        System.out.println(mahasiswa1.Umur + " Tahun");
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);

    }
}