package pertemuan2;

public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dosen1 = new Dosen24();
        dosen1.idDosen = "ANR";
        dosen1.nama = "Anugrah Nur Rahmanto";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2022;
        dosen1.bidangKeahlian = "Kesehatan dan Keselamatan Kerja";

        dosen1.tampilInformasi();
        System.out.println();
        dosen1.setStatusAktif(true);
        int masaKerja = dosen1.hitungMasaKerja(2025);
        dosen1.ubahBidangKeahlian("Desain Antarmuka");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja : " + masaKerja);
        System.out.println();

        Dosen24 dosen2 = new Dosen24("YA", "Yuri Ariyanto", "Sistem Operasi", true, 2020);
        dosen2.tampilInformasi();
        System.out.println();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2024);
        dosen2.ubahBidangKeahlian("Jaringan Komputer");
        dosen2.tampilInformasi();
        

    }
}
