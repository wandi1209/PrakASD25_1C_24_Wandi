package pertemuan3;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen24[] arrayOfDosen = new Dosen24[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = input.nextLine();
            System.out.print("Nama          : ");
            nama = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            dummy = input.nextLine();
            if(dummy.equalsIgnoreCase("pria")){
                jenisKelamin = true;
            } else if (dummy.equalsIgnoreCase("wanita")){
                jenisKelamin = false;
            } else {
                System.out.println("Masukkan data yang valid.");
                i--;
                continue;
            }
            System.out.print("Usia          : ");
            usia = Integer.parseInt(input.nextLine());
            System.out.println("--------------------------------------------------");
            
            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("--------------------------------------------------");
        }
        
    }
}
