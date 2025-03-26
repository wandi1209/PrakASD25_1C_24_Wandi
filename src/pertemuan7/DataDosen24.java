package pertemuan7;

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

    void pencarianDataSequential24(String cariNama){
        int hitung = 0;
        int idx = -1;
        for (int i = 0; i < this.idx; i++) {
            if(dataDosen[i].nama.equalsIgnoreCase(cariNama)){
                idx = i;
                hitung++;
            }
        }
        if(hitung > 1){
            System.out.println("Peringatan: Hasil pencarian lebih dari 1.");
        } else {
            if(idx != -1){
                System.out.println("------------------------------------");
                System.out.println("--------- HASIL PENCARIAN ----------");
                System.out.println("------------------------------------");
                dataDosen[idx].tampil();
            } else {
                System.out.println("Dosen dengan nama " + cariNama + " tidak ditemukan.");
            }
        }
    }

    Dosen24 pencarianDataBinary24(int cariUsia, int left, int right){
        int mid;
        if(right >= left){
            mid = (right + left) / 2;

            while (mid >= left && dataDosen[mid] == null) {
                mid--;
            }
            
            if(mid >= 0 && mid < idx){
                if(cariUsia == dataDosen[mid].usia){
                    boolean multiFind = false;
                    int i = mid - 1;
                    while (i >= left && dataDosen[i].usia == cariUsia) {
                        multiFind = true;
                        i--;
                    }
                    
                    int j = mid + 1;
                    while (j <= right && dataDosen[j].usia == cariUsia) {
                        multiFind = true;
                        j++;
                    }
                    
                    if (multiFind) {
                        System.out.println("Peringatan: Ada lebih dari satu dosen dengan usia " + cariUsia);
                    }

                    return dataDosen[mid];
                    
                } else if (cariUsia < dataDosen[mid].usia) {
                    return pencarianDataBinary24(cariUsia, left, mid-1);
                } else {
                    return pencarianDataBinary24(cariUsia, mid+1, right);
                }
            }
        }
        return null;
    }
}
