package pertemuan4;

import java.util.Scanner;

public class Main24 {
    static Scanner wandi24 = new Scanner(System.in);
    static Barang24[] arrayOfBarangs24 = new Barang24[6];
    static Transaksi24 transaksi24 = new Transaksi24();

    public static void main(String[] args) {
        arrayOfBarangs24[0] = new Barang24("Br01", "Onde-Onde", "Makanan", 15, 2000);
        arrayOfBarangs24[1] = new Barang24("Br02", "Lumpia Udang", "Makanan", 15, 2000);
        arrayOfBarangs24[2] = new Barang24("Br03", "Teh Manis", "Minuman", 15, 2400);
        arrayOfBarangs24[3] = new Barang24("Br04", "Onde-Onde", "Makanan", 15, 5000);
        arrayOfBarangs24[4] = new Barang24("Br05", "Onde-Onde", "Makanan", 15, 2000);
        arrayOfBarangs24[5] = new Barang24("Br06", "Onde-Onde", "Makanan", 15, 2000);
        menu24();
    }

    static void menu24(){
        int menu;
        while (true) { 
            System.out.println("======== JTI Kantin ========");
            System.out.println("Menu : ");
            System.out.println("1. Tampil data barang");
            System.out.println("2. Tampil total penjualan");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            menu = wandi24.nextInt();
            wandi24.nextLine();
            switch (menu) {
                case 1 -> {
                    transaksi24.tampilSemuanData24(arrayOfBarangs24);
                }
                case 2 -> {
                    System.out.print("Input jenis barang : ");
                    String jenis24 = wandi24.nextLine();
                    int stock24 = transaksi24.totalStockByJenis24(arrayOfBarangs24, jenis24);
                    System.out.println("total stock " + jenis24 +  " : " + stock24);

                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Masukkan pilihan menu yang sesuai.");
            }
        }
    }
}
