package pertemuan11;

import java.util.Scanner;

public class LayananKRSMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS24 antrian = new QueueKRS24(5);
        int pilihan;

        do { 
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS 2 Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa yang Sudah Diproses");
            System.out.println("8. Jumlah Mahasiswa yang Belum Diproses");
            System.out.println("9. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("NIM   :   ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  :   ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi :   ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas :   ");
                    String kelas = sc.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, prodi, kelas);
                    antrian.enqueue_24(mhs);
                }
                case 2 -> antrian.dequeue_24();
                case 3 -> antrian.print_24();
                case 4 -> antrian.lihatTerdepan_24();
                case 5 -> antrian.lihatAkhir_24();
                case 6 -> {
                    int jumlahAntrian = antrian.getAntrian_24();
                    System.out.println("Jumlah mahasiswa dalam antrian : " + jumlahAntrian);
                }
                case 7 -> {
                    int diproses = antrian.getDiproses_24();
                    System.out.println("Jumlah mahasiswa yang telah di proses : " + diproses);
                }
                case 8 -> {
                    int belumDiproses = antrian.getBelumDiproses_24();
                    System.out.println("Jumlah mahasiswa yang belum di proses : " + belumDiproses);
                }
                case 9 -> antrian.clear_24();
                case 0 -> System.out.println("Terima kasih.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan!= 0);

        sc.close();
    }
}
