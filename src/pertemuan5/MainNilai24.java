package pertemuan5;

public class MainNilai24 {
    public static void main(String[] args) {
        Nilai24[] daftarNilai = {
            new Nilai24("Ahmad", "220101001", 2022, 78, 82),
            new Nilai24("Budi", "220101002", 2022, 85, 88),
            new Nilai24("Cindy", "220101003", 2022, 90, 87),
            new Nilai24("Dian", "220101004", 2022, 76, 79),
            new Nilai24("Eko", "220101005", 2022, 92, 95),
            new Nilai24("Fajar", "220101006", 2022, 88, 85),
            new Nilai24("Gina", "220101007", 2022, 80, 83),
            new Nilai24("Hadi", "220101008", 2022, 82, 84),
        };
        Nilai24 nilai = new Nilai24();
        int nilaiTertinggiUts = nilai.cariUtsTertinggiDC(daftarNilai, 0, daftarNilai.length - 1);
        int nilaiTerendahUts = nilai.cariUtsTerendahDC(daftarNilai, 0, daftarNilai.length - 1);
        double rataUas = nilai.cariRataUas(daftarNilai);

        System.out.println("Nilai UTS tertinggi menggunakan DC : " + nilaiTertinggiUts);
        System.out.println("Nilai UTS tertinggi menggunakan DC : " + nilaiTerendahUts);
        System.out.println("Rata-rata nilai UAS menggunakan BF : " + rataUas);


        
    }
}
