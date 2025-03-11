package pertemuan4;

public class Barang24 {
    String kodeBarang24;
    String namaBarang24;
    String jenisBarang24;
    int stock24;
    int harga24;

    public Barang24(String kodeBarang24, String namaBarang24, String jenisBarang24,int stock24,int harga24){
        this.kodeBarang24 = kodeBarang24;
        this.namaBarang24 = namaBarang24;
        this.jenisBarang24 = jenisBarang24;
        this.stock24 = stock24;
        this.harga24 = harga24;
    }

    void tampilData24(){
        System.out.printf("%-20s %-20s %-20s %-20d %-20d\n", kodeBarang24, namaBarang24, jenisBarang24, stock24, harga24);
    }
}
