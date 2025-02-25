package pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();
        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[jumlahMataKuliah];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah24("", "", 0, 0);
            arrayOfMataKuliah[i].tambahData();
            System.out.println("-------------------------------------------------");
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-------------------------------------------------");
        }
    }
}
