package pertemuan3;

public class MataKuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Konstruktor tanpa parameter
    public MataKuliah24(){

    }

    // Konstruktor dengan parameter lengkap
    public MataKuliah24(String kode, String nama, int sks, int jumlahJam ){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Konstruktor hanya kode dan nama saja
    public MataKuliah24(String kode, String nama){
        this.kode = kode;
        this.nama =nama;
        sks = 4;
        jumlahJam = 8;
    }

}
