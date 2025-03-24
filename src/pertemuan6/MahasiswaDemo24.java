package pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasais Ke-" + (i+1) + " :");
            System.out.print("Masukkan NIM : ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = input.nextLine();
            System.out.print("Masukkan IPK : ");
            int ipk = input.nextInt();
            input.nextLine();
            Mahasiswa24 mahasiswa = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
        }

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarka IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}
