package pertemuan5;

import java.util.Scanner;

public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial24 fk = new Faktorial24();

        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();

        System.out.println("Nilai faktorial " + nilai + " menggunakn BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakn DC : " + fk.faktorialDC(nilai));

    }

    
}
