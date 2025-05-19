package pertemuan12;

public class Mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa24() {
    }

    public Mahasiswa24(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilkanInformasi_24(){
        System.out.printf("%s \t %s \t %s \t %.1f%n", nama, nim, kelas, ipk);
    }
}
