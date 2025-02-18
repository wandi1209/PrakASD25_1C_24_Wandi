package pertemuan2;

public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk1 = new MataKuliah24(); 
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 6;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        System.out.println();
        
        mk1.ubahSKS(0);
        mk1.tambahJam(3);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();
        System.out.println();


        MataKuliah24 mk2 = new MataKuliah24("BD", "Basis Data", 8, 8);
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.kurangiJam(6);

        System.out.println();
        mk2.tampilInformasi();
    }
}
