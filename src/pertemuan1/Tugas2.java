package pertemuan1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int menu = menu();
            int sisi;
            float hasil;

            if (menu == 4) {
                return;
            }

            System.out.print("Masukkan sisi : ");
            sisi = input.nextInt();
            System.out.println("=============================");
            switch (menu) {
                case 1 -> hasil = volume(sisi);
                case 2 -> hasil = luas(sisi);
                case 3 -> hasil = keliling(sisi);
                default -> {
                    System.out.println("Pilih menu yang tersedia.");
                    continue;
                }
            }
            System.out.println("Hasil " + hasil);
            System.out.println("=============================");
        }
    }

    static int menu(){
        int menu;
        System.out.println("Menu : ");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();
        return menu;
    }
    
    static int volume(int s){
        System.out.print("Hasil volume kubus adalah ");
        return s * s * s;
    }
    
    static int luas(int s){
        System.out.print("Hasil luas kubus adalah ");
        return (int)(6 * Math.pow(s,2));
    }
    static int keliling(int s){
        System.out.print("Hasil keliling kubus adalah ");
        return 12 * s;
    }
}
