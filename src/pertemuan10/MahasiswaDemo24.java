package pertemuan10;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);
        int pilih;

        do { 
            System.out.println("\nMenu : ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Jumlah Tugas Dikumpulkan");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, kelas);
                    stack.push_24(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa24 dinilai = stack.pop_24();
                    if(dinilai != null){
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100) : ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai_24(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner_24(nilai);
                        System.out.println("Nilai Biner Tugas : " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa24 lihat = stack.peek_24();
                    if(lihat != null){
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa24 lihatTerbawah = stack.peek_terbawah_24();
                    if(lihatTerbawah != null){
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatTerbawah.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print_24();
                    break;
                case 6:
                    int jumlahKumpul = stack.hitungJumlahKumpul_24();
                    if(jumlahKumpul != 0){
                        System.out.println("\nJumlah Tugas yang dikumpukan : " + jumlahKumpul);
                    } else {
                        System.out.println("Tidak ada tugas yang dikumpulkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
