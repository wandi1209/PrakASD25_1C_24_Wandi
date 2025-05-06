package pertemuan11;

public class Mahasiswa24 {
    String nama, nim, prodi, kelas;

    public Mahasiswa24(String nama, String nim, String prodi, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData_24(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
