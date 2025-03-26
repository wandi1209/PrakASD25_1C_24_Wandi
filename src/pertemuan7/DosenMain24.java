package pertemuan7;

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
            System.out.println("6. Cari Dosen Berdasarkan Nama");
            System.out.println("7. Cari Dosen Berdasarkan Usia");
            System.out.println("8. Keluar");
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
                    System.out.print("Masukkan Nama : ");
                    String cariNama = input.nextLine();
                    dataDosen.pencarianDataSequential24(cariNama);
                }
                case 7 -> {
                    System.out.print("Masukkan Usia : ");
                    int cariUsia = input.nextInt();
                    dataDosen.sortingASC();
                    Dosen24 find = dataDosen.pencarianDataBinary24(cariUsia, 0, dataDosen.idx - 1);
                    if(find != null){
                        System.out.println("------------------------------------");
                        System.out.println("--------- HASIL PENCARIAN ----------");
                        System.out.println("------------------------------------");
                        find.tampil();
                    } else {
                        System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
                    }
                }
                case 8 -> {
                    System.out.println("Keluar.");
                    return;
                }
                default -> System.out.println("Masukkan Pilihan Yang Sesuai.");
            }
        }
    }
}
