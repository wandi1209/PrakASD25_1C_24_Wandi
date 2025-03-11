package pertemuan4;

public class Transaksi24 {
    void tampilSemuanData24(Barang24[] barang24){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Kode", "Nama Barang", "Jenis", "Stock", "Harga Barang");
        for (int i = 0; i < barang24.length; i++) {
            barang24[i].tampilData24();
        }
    }

    int totalStockByJenis24(Barang24[] barang24, String jenis24){
        int total24 = 0;
        for (int i = 0; i < barang24.length; i++) {
            if(barang24[i].jenisBarang24.equalsIgnoreCase(jenis24)){
                total24 += barang24[i].stock24;
            }
        }
        return total24;
    }
}
