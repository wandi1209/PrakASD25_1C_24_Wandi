package pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    static Scanner input = new Scanner(System.in);
    static int jumlahMatkul;
    static String[] namaMatkul;
    static int[] sks;
    static int[] semester;
    static String[] jadwalHari;
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    public static void main(String[] args) {

        menuUtama();

        // while (true) { 
        //     menuUtama();

        // }
    }

    static void menuUtama(){
        int menu;
        
        while(true){
            System.out.println("\nPilihan Menu :");
            System.out.println("1. Input data mata kuliah");
            System.out.println("2. Tampilkan Jadwal Kuliah");
            System.out.println("3. Cari mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu : ");
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1 -> inputData();
                case 2 -> menuJadwal();
                case 3 -> cariMatkul();
                case 4 -> {
                    System.out.println("Terima Kasih.");
                    return;
                }
                default -> System.out.println("Menu tidak tersedia.");
            }
        }



    }

    static void inputData(){
        System.out.print("\nMasukkan jumlah mata kuliah : ");
        jumlahMatkul = input.nextInt();
        input.nextLine();

        namaMatkul = new String[jumlahMatkul];
        sks = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        jadwalHari = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nData Mata Kuliah " + (i+1));
            System.out.println("====================================");
            System.out.print("Masukkan nama mata kuliah : ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah : ");
            sks[i] = input.nextInt();
            System.out.print("Masukkan semester mata kuliah : ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan jadwal hari mata kuliah : ");
            jadwalHari[i] = input.nextLine();
        }
    }

    static void menuJadwal(){
        int menu;

        while (true) { 
            System.out.println("\nPilihan Menu :");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Tampilkan berdasarkan hari");
            System.out.println("3. Tampilkan berdasarkan semester");
            System.out.println("4. Kembali");
            System.out.print("Masukkan menu : ");
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1 -> tampilSeluruhJadwal();
                case 2 -> tampilJadwalHari();
                case 3 -> tampilJadwalSemster();
                case 4 -> {
                    System.out.println("Terima Kasih.");
                    return;
                }
                default -> System.out.println("Menu tidak tersedia.");
            }
        }
    }

    static void tampilSeluruhJadwal() {
        System.out.println("\nJadwal Seluruh Mata Kuliah");
        for (String h : hari) {
            System.out.println(h + " :");
            boolean adaMatkul = false;
    
            for (int i = 0; i < jumlahMatkul; i++) {
                if (jadwalHari[i].equalsIgnoreCase(h)) {
                    System.out.printf("  - %s (%d SKS, Semester %d) \n", namaMatkul[i], sks[i], semester[i]);
                    adaMatkul = true;
                }
            }

            if (!adaMatkul) {
                System.out.println("  (Tidak ada mata kuliah)");
            }
        }
    }
    
    static void tampilJadwalHari(){
        String hariCari;
        boolean adaMatkul = false;

        System.out.print("\nMasukkan Hari : ");
        hariCari = input.nextLine();
        for (int i = 0; i < jumlahMatkul; i++) {
            if(hariCari.equalsIgnoreCase(jadwalHari[i])){
                System.out.printf("  - %s (%d SKS, Semester %d) \n", namaMatkul[i], sks[i], semester[i]);
                adaMatkul = true;
            }
        }
        if (!adaMatkul) {
            System.out.println("  (Tidak ada mata kuliah)");
        }
    }

    static void tampilJadwalSemster() {
        System.out.print("\nMasukkan Semester: ");
        int cari = input.nextInt();
        input.nextLine();
    
        System.out.println("\nJadwal Seluruh Mata Kuliah Semester " + cari);
    
        boolean adaMatkul = false;
    
        for (String h : hari) {
            System.out.println(h + " :");
            boolean adaDiHariIni = false;
    
            for (int i = 0; i < jumlahMatkul; i++) {
                if (semester[i] == cari && jadwalHari[i].equalsIgnoreCase(h)) {
                    System.out.printf("  - %s (%d SKS) \n", namaMatkul[i], sks[i]);
                    adaDiHariIni = true;
                    adaMatkul = true;
                }
            }
    
            if (!adaDiHariIni) {
                System.out.println("  (Tidak ada mata kuliah)");
            }
        }
    
        if (!adaMatkul) {
            System.out.println("(Tidak ada mata kuliah untuk semester ini)");
        }
    }    

    static void cariMatkul(){
        String cari;
        boolean adaMatkul = false;

        System.out.print("\nMasukkan nama mata kuliah : ");
        cari = input.nextLine();

        for (int i = 0; i < jumlahMatkul; i++) {
            if (cari.equalsIgnoreCase(namaMatkul[i])) {
                System.out.printf("  - %s (%d SKS, Semester %d, Hari %s) \n", namaMatkul[i], sks[i], semester[i], jadwalHari[i]);
                adaMatkul = true;
            }
        }

        if (!adaMatkul) {
            System.out.println("\nMata kuliah tidak ditemukan.");
        }
    }

}
