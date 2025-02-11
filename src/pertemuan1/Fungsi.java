package pertemuan1;

public class Fungsi {
    static double totalPendapatan;
    static String namaToko = "RoyalGarden";
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static double[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    public static void main(String[] args) {
        System.out.println("\n========================");
        System.out.println("== Stock Semua Cabang ==");
        System.out.println("========================");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", " " ,"Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.printf("%s %d   ", namaToko, (i+1));
            for (int j = 0; j < stockBunga[0].length; j++) {
                System.out.printf("%-11d", stockBunga[i][j]);
            }
            System.out.println();
        }
        pendapatanCabang();
        System.out.println("Pengurangan Stock di RoyalGarden 4");
        System.out.println("Aglonema - 1");
        System.out.println("Keladi - 2");
        System.out.println("Mawar - 5");
        stockBunga[3][0] -= 1;
        stockBunga[3][1] -= 2;
        stockBunga[3][3] -= 5;
        stockCabang4();
    }
    
    static void pendapatanCabang(){
        System.out.println("\n========================");
        System.out.println("==  Total Keuntungan  ==");
        System.out.println("========================");
        for (int i = 0; i < stockBunga.length; i++) {
            totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += (stockBunga[i][j] * hargaBunga[j]);
            }
            System.out.printf("%s %d : %.0f \n",namaToko, i, totalPendapatan);
        }
    }

    static void stockCabang4(){
        System.out.println("\n========================");
        System.out.println("==   Stock Cabang 4   ==");
        System.out.println("========================");
        System.out.println("Jenis Bunga | Jumlah Stok");
        for (int i = 0; i < hargaBunga.length; i++) {
            System.out.printf("%-10s  | %d\n", namaBunga[i], stockBunga[3][i]);
        }
    }
}
