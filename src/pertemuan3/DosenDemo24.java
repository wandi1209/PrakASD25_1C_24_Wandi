package pertemuan3;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = Integer.parseInt(input.nextLine());
        Dosen24[] arrayOfDosen = new Dosen24[jumlahDosen];
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

        DataDosen24.dataSemuaDosen(arrayOfDosen);
        DataDosen24.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen24.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen24.infoDosenPalingTua(arrayOfDosen);
        DataDosen24.infoDosenPalingMuda(arrayOfDosen);
        
    }
}
