package pertemuan3;

public class MataKuliahDemo24 {
    public static void main(String[] args) {
        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[3];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah24("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData();
            System.out.println("-------------------------------------------------");
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-------------------------------------------------");
        }
    }
}
