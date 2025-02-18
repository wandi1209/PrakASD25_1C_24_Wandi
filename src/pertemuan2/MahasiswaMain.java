package pertemuan2;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "Wandi";
        mhs1.nim = "244107020003";
        mhs1.kelas = "TI-1C";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-2C");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nabila", "2141720160", 3.25, "TI-2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa24 mhsDimas = new Mahasiswa24("Dimas Putra", "24410702000", 3.70, "TI-3G");
        mhsDimas.tampilkanInformasi();
        
    }
}
