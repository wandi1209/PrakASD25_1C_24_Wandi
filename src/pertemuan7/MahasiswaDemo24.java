package pertemuan7;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i+1) + " :");
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            input.nextLine();
            Mahasiswa24 mahasiswa = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
            System.out.println("---------------------------------");
        }

        list.tampil();
        // Melakukan pencarian data sequential
        System.out.println("-----------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();

        System.out.println("Menggunakan suqential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        input.close();
    }
}
