package pertemuan3;

import java.util.Scanner;
public class MataKuliah24 {
    public Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Konstruktor dengan parameter lengkap
    public MataKuliah24(String kode, String nama, int sks, int jumlahJam ){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(){
        System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam  : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
    }

}
