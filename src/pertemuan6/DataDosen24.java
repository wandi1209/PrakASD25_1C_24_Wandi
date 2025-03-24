package pertemuan6;

public class DataDosen24 {
    Dosen24[] dataDosen = new Dosen24[10];
    int idx;

    void tambah(Dosen24 dsn){
        if(idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++; 
        }else{
            System.out.println("Data sudah penuh.");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("---------------------------");
        }
    }

    void sortingASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if(dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen24 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
        System.out.println("Data setelah Bubble Sort ASC (Usia muda ke tua) : ");
        tampil();
    }

    void sortingDSC(){
        for (int i = 0; i < idx-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < idx; j++) {
                if(dataDosen[j].usia > dataDosen[idxMax].usia){
                    idxMax = j;
                }
            }
            Dosen24 temp = dataDosen[i];
            dataDosen[i] = dataDosen[idxMax];
            dataDosen[idxMax] = temp;
        }
        System.out.println("Data setelah Selection Sort DESC (Usia tua ke muda) : ");
        tampil();
    }

    void insertionSort(){
        for (int i = 0; i < idx; i++) {
            Dosen24 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data setelah Insertion Sort DESC (Usia tua ke muda) : ");
        tampil();
    }
}
