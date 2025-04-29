package pertemuan10;

public class Mahasiswa24 {
    String nama, nim, kelas;
    int nilai;

    Mahasiswa24(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai_24(int nilai) {
        this.nilai = nilai;
    }
}
