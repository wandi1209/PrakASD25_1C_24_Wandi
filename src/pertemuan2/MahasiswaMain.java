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
    }
}
