package pertemuan12.tugas;

import java.util.Scanner;

public class SLLMainQueue24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        SingleLinkedListQueue24 sll = new SingleLinkedListQueue24();

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambahkan antrian");
            System.out.println("2. Memanggil antrian");
            System.out.println("3. Tampilkan antrian terdepan");
            System.out.println("4. Tampilkan antrian terakhir");
            System.out.println("5. Tampilkan jumlah antrian");
            System.out.println("6. Tampilkan seluruh antrian");
            System.out.println("7. Kosongkan antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilihan Menu : ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("\n--- Tambah Antrian ---");
                    System.out.print("NIM     : ");
                    String nim = input.nextLine();
                    System.out.print("Nama    : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = input.nextLine();
                    MahasiswaQueue24 newMhs = new MahasiswaQueue24(nim, nama, kelas);
                    sll.enqueue_24(newMhs);
                }
                case 2 -> {
                    sll.dequeue_24();
                }
                case 3 -> {
                    System.out.println("Mahasiswa di antrian pertama : ");
                    sll.peek_24();
                }
                case 4 -> {
                    System.out.println("Mahasiswa di antrian terakhir : ");
                    sll.peek_last_24();
                }
                case 5 -> {
                     int jumlahAntri = sll.getTotalQueue();
                    if(jumlahAntri == 0){
                        System.out.println("Tidak ada mahasiswa yang sedang mengantri.");
                    } else {
                        System.out.println("Jumlah mahasiswa yaang sedang mengantri adalah " + jumlahAntri + " mahasiswa.");
                    }
                }
                case 6 -> {
                   sll.print_24();
                }
                case 7 -> {
                   sll.clear_24();
                }
                case 8 -> {
                    System.out.println("Sistem berhenti\n");
                    return;
                }
                default -> System.out.println("Masukkan pilihan yang sesuai.");
            }
        }
    }
}
