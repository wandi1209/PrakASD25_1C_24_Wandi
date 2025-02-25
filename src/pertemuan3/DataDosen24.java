package pertemuan3;

public class DataDosen24 {
    static void dataSemuaDosen(Dosen24[] arrayOfDosen){
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            arrayOfDosen[i].tampilkanDetailDosen();
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        System.out.println("Jumlah Dosen Berdasarkan Jenis Kelamin");
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Dosen Pria      : " + pria);
        System.out.println("Dosen Wanita    : " + wanita);
        System.out.println("--------------------------------------------------");
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen){
        int pria = 0, wanita = 0;
        float jmlhUsiaPria = 0, jmlhUsiaWanita = 0;
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
                jmlhUsiaPria += dosen.usia;
            } else {
                wanita++;
                jmlhUsiaWanita += dosen.usia;
            }
        }
        System.out.println("Rata-rata Usia Dosen Pria      : " + (jmlhUsiaPria/pria));
        System.out.println("Rata-rata Usia Dosen Wanita    : " + (jmlhUsiaWanita/wanita));
        System.out.println("--------------------------------------------------");
    }

    static void infoDosenPalingTua(Dosen24[] arrayOfDosen){
        int tertua = 0, index = -1;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if( arrayOfDosen[i].usia > tertua){
                tertua = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Tua");
        arrayOfDosen[index].tampilkanDetailDosen();

    }
    static void infoDosenPalingMuda(Dosen24[] arrayOfDosen){
        int termuda = 100, index = -1;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if( arrayOfDosen[i].usia < termuda){
                termuda = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Muda");
        arrayOfDosen[index].tampilkanDetailDosen();
    }
}
