package pertemuan11;

import java.util.Scanner;

public class LayananAkademikSIAKAD24 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        AntrianLayanan24 antrian = new AntrianLayanan24(5);
        int pilihan;

        do { 
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   :   ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  :   ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi :   ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas :   ");
                    String kelas = sc.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, prodi, kelas);
                    antrian.tambahAntrian_24(mhs);
                    break;
                case 2:
                    Mahasiswa24 dilayani = antrian.layaniMahasiswa_24();
                    if(dilayani != null){
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData_24();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan_24();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan!= 0);

        sc.close();
    }
}
