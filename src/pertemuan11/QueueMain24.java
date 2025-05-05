package pertemuan11;

import java.util.Scanner;

public class QueueMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasistas queue : ");
        int n = sc.nextInt();
        
        Queue24 Q = new Queue24(n);
        
        do { 
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue_24(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue_24();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikelarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print_24();
                    break;
                case 4:
                    Q.peek_24();
                    break;
                case 5:
                    Q.clear_24();
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }
}
