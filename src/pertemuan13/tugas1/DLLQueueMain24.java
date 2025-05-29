package pertemuan13.tugas1;

import java.util.Scanner;

public class DLLQueueMain24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DLLQueue dll = new DLLQueue();
        
        while (true) {
            menu();
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian : ");
                    int no = input.nextInt();
                    input.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = input.nextLine();
                    Queue24 data = new Queue24(no, nama);
                    dll.enqueue_24(data);
                    break;
                case 2:
                    dll.dequeue_24();
                    dll.print_24();
                    break;
                case 3:
                    dll.print_24();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilih menu yang sesuai.");
            }
        }
    }

    static void menu(){
        System.out.println("\n+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
