package pertemuan6;

import java.util.Scanner;

public class DosenMain24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen24 dataDosen = new DataDosen24();

        while (true) {
            System.out.println("\nPilihan Menu :");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting Berdasarkan Umur ASC (Bubble Sort)");
            System.out.println("4. Sorting Berdasarkan Umur DESC (Selection Sort)");
            System.out.println("5. Sorting Berdasarkan Umur DESC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("Masukkan Data Dosen : ");
                    System.out.print("Kode          : ");
                    String kode = input.nextLine();
                    System.out.print("Nama          : ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin : ");
                    String jk = input.nextLine();
                    System.out.print("Usia          : ");
                    int usia = input.nextInt();
                    input.nextLine();
                    System.out.println("---------------------------");

                    Dosen24 dosenNew = new Dosen24(kode, nama, jk, usia);
                    dataDosen.tambah(dosenNew);

                }
                case 2 -> dataDosen.tampil();
                case 3 -> dataDosen.sortingASC();
                case 4 -> dataDosen.sortingDSC();
                case 5 -> dataDosen.insertionSort();
                case 6 -> {
                    System.out.println("Keluar.");
                    return;
                }
                default -> System.out.println("Masukkan Pilihan Yang Sesuai.");
            }
        }
    }
}
