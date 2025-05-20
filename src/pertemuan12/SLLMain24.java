package pertemuan12;

import java.util.Scanner;

public class SLLMain24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        SingleLinkedList24 sll = new SingleLinkedList24();
        Mahasiswa24 newMhs = new Mahasiswa24();

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambahkan di depan (addFirst)");
            System.out.println("2. Tambahkan di akhir (addLast)");
            System.out.println("3. Tambahkan setelah (insertAfter)");
            System.out.println("4. Tambahkan di index (insertAt)");
            System.out.println("5. Print data list");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Menu : ");
            menu = input.nextInt();
            input.nextLine();

            if(menu > 0 && menu < 5){
                System.out.println("\n--- Tambah Mahasiswa ---");
                System.out.print("NIM     : ");
                String nim = input.nextLine();
                System.out.print("Nama    : ");
                String nama = input.nextLine();
                System.out.print("Kelas   : ");
                String kelas = input.nextLine();
                System.out.print("IPK     : ");
                double ipk = input.nextDouble();
                input.nextLine();
                newMhs = new Mahasiswa24(nim, nama, kelas, ipk);
            }
            
            switch (menu) {
                case 1:
                    sll.addFirst_24(newMhs);
                    break;
                case 2:
                    sll.addLast_24(newMhs);
                    break;
                case 3:
                    System.out.print("Masukkan Nama Mahasiswa yang jadi patokan (key) : ");
                    String key = input.nextLine();
                    sll.insertAfter_24(key, newMhs);
                    break;
                case 4:
                    System.out.print("Masukkan index : ");
                    int index = input.nextInt();
                    input.nextLine();
                    sll.insertAt_24(index, newMhs);
                    break;
                case 5:
                    sll.print_24();
                    break;
                case 6:
                    System.out.println("Sistem berhenti");
                    System.exit(0);
                default:
                    System.out.println("Masukkan pilihan yang sesuai.");
            }
        }
    }
}
