package pertemuan10;

public class Surat24 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    Surat24(){}

    Surat24(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampilSurat(){
        String keterangan = "";
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        switch (jenisIzin) {
            case 'S' -> keterangan = "Sakit";
            case 'I' -> keterangan = "Izin";
        }
        System.out.println("Jenis Izin      : " + keterangan);
        System.out.println("Durasi          : " + durasi + " hari");
    }
}
