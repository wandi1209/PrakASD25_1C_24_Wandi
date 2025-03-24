package pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        for (int i = 0; i < 5; i++) {
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

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarka IPK (DESC) :");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
