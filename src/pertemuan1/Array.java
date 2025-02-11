package pertemuan1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ips, bobotNilai = 0;
        int totalSks = 0;
        float[][] nilaiMk = new float[8][2];
        int[] sks = {4, 4, 4, 6, 4, 4, 6, 4};
        String[] nilaiHuruf = new String[8];
        String[] namaMk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Rekayasa Perangkat Lunak",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja",
        };

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        
        for (int i = 0; i < namaMk.length; i++) {
            System.out.printf("Masukkan nilai Angka untuk MK %s : ", namaMk[i]);
            nilaiMk[i][0] = input.nextFloat();
        }
        
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        
        System.out.printf("%-40s %-15s %-15s %-15s", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < nilaiMk.length; i++) {
            if (nilaiMk[i][0] > 80) {
                nilaiHuruf[i] = "A";
                nilaiMk[i][1] = 4;
            } else if (nilaiMk[i][0] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiMk[i][1] = (float) 3.5;
            } else if (nilaiMk[i][0] > 65) {
                nilaiHuruf[i] = "B";
                nilaiMk[i][1] = 3;
            } else if (nilaiMk[i][0] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiMk[i][1] = (float) 2.5;
            } else if (nilaiMk[i][0] > 50) {
                nilaiHuruf[i] = "C";
                nilaiMk[i][1] = 2;
            } else if (nilaiMk[i][0] > 39) {
                nilaiHuruf[i] = "D";
                nilaiMk[i][1] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiMk[i][1] = 0;
            }
        }
        for (int i = 0; i < nilaiMk.length; i++) {
            System.out.printf("\n%-40s %-15.2f %-15s %-15.2f", namaMk[i], nilaiMk[i][0], nilaiHuruf[i], nilaiMk[i][1]);
            bobotNilai += (nilaiMk[i][1] * sks[i]);
            totalSks += sks[i];
        }
        System.out.println("\n===============================");
        ips = bobotNilai/totalSks;
        System.out.printf("IP : %.2f", ips);

    }
}
