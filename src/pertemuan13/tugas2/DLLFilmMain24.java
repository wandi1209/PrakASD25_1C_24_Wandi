package pertemuan13.tugas2;

import java.util.Scanner;

public class DLLFilmMain24 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        DLLFilm24 dll = new DLLFilm24();

        while (true) {
            menu();
            System.out.print("Pilihan Menu : ");
            int menu = input.nextInt();
            input.nextLine();



            switch (menu) {
                case 1 -> {
                    System.out.println("Masukkan Data Film Posisi Awal");
                    Film24 data = formAdd(input);
                    dll.addFirst_24(data);
                }
                case 2 -> {
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    Film24 data = formAdd(input);
                    dll.addLast_24(data);
                }
                case 3 -> {
                    System.out.println("Masukkan Data Film Posisi Index Tertentu");
                    Film24 data = formAdd(input);
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    input.nextLine();
                    dll.insertAt_24(index, data);
                }
                case 4 -> dll.removeFirst_24();
                case 5 -> dll.removeLast_24();
                case 6 -> {
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    input.nextLine();
                    dll.removeAt_24(index);
                }
                case 7 -> dll.print_24();
                case 8 -> {
                    System.out.print("ID Film : ");
                    int id = input.nextInt();
                    input.nextLine();
                    Film24 data = dll.cariFilm_24(id);
                    if(data != null){
                        data.tampilkan_24();
                    } else {
                        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
                    }
                }
                case 9 -> {
                    System.out.println("Urutan Film Berdasarkan Rating Tertinggi : ");
                    dll.sortingByRating();
                }
                case 10 -> {
                    return;
                }
                default -> System.out.println("Masukkan menu yang sesuai.");
            }
        }
    }

    static void menu(){
        System.out.println("===================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
    }

    static Film24 formAdd(Scanner input){
        System.out.print("ID Film : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Judul Film : ");
        String judul = input.nextLine();
        System.out.print("Rating Film : ");
        double rating = input.nextDouble();
        input.nextLine();
        Film24 data = new Film24(id, judul, rating);

        return data;
    }
}
