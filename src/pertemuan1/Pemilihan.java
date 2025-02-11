package pertemuan1;
import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLulus = true;
        String nilaiHuruf = "";

        System.out.println("\nProgram Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas : ");
        int tugas = input.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        int kuis = input.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int uas = input.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        
        double nilaiAkhir = ((tugas*0.2) + (kuis*0.2) + (uts*0.3) + (uas*0.3));

        if(tugas < 0 || kuis < 0 || uts < 0 || uas < 0 || tugas > 100 || kuis > 100 || uts > 100 || uas > 100){
            System.out.println("Nilai Tidak Valid.");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <=80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <=73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <=65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <=60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <=50) {
                nilaiHuruf = "D";
                isLulus = false;
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                isLulus = false;
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");

            if(isLulus){
                System.out.println("SELAMAT ANDA LULUS");
            } else { 
                System.out.println("ANDA TIDAK LULUS");
            }
        }
        input.close();
        
    }
}
