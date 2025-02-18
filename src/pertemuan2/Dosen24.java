package pertemuan2;

public class Dosen24 {
    String idDosen, nama, bidangKeahlian, status;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen24(){}

    public Dosen24(String idDosen, String nama, String bidangKeahlian,
    boolean statusAktif,
    int tahunBergabung){
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilInformasi(){
        if(statusAktif){
            status = "Aktif";
        } else {
            status = "Tidak Aktif";
        }
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusAktif){
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int tahunSekarang){
        if(tahunSekarang < tahunBergabung) {
            return -1;
        } else {
            int masaKerja = tahunSekarang - tahunBergabung;
            return masaKerja;
        }
    }

    void ubahBidangKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
