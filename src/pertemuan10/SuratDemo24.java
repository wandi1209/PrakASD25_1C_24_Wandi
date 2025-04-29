package pertemuan10;

import java.util.Scanner;

public class SuratDemo24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat24 stack = new StackSurat24(5);

        while (true) { 
            System.out.println("\nMenu : ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            int pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1 -> {
                    System.out.print("ID Surat : ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    char jenisIzin;
                    while (true) { 
                        System.out.print("Jenis Izin (S = Sakit, I = Izin) : ");
                        jenisIzin = scan.nextLine().charAt(0);
                        if(jenisIzin == 'S' || jenisIzin == 'I') break;
                        System.out.println("Masukkan jenis yang sesuai (S/I/A)");
                    }
                    System.out.print("Durasi (Hari) : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat24 surat = new Surat24(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push_24(surat);
                }
                case 2 -> {
                    Surat24 diproses = stack.pop_24();
                    if (diproses != null) {
                        System.out.println("Surat dengan ID " + diproses.idSurat + " telah diproses.");
                    }
                }
                case 3 -> {
                    Surat24 terakhir = stack.peek_24();
                    if(terakhir != null){
                        terakhir.tampilSurat();
                    }
                }
                case 4 -> {
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String cari = scan.nextLine();
                    Surat24 result = stack.find_24(cari);
                    if(result != null){
                        result.tampilSurat();
                    } else {
                        System.out.println("Surat dengan nama " + cari + " tidak ditemukan.");
                    }
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Masukkan menu yang tersedia.");
            }
        }
    }
}
