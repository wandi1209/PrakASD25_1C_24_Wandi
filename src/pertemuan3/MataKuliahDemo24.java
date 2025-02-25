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
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------------------");
        }
    }
}
