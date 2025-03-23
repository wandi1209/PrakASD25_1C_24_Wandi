package pertemuan5;

public class Nilai24 {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    Nilai24(){}

    Nilai24(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int cariUtsTertinggiDC(Nilai24[] nilai, int l, int r){
        if(l==r){
            return nilai[l].nilaiUTS;
        }

        int mid = (l+r)/2;
        int lmax = cariUtsTertinggiDC(nilai, l, mid);
        int rmax = cariUtsTertinggiDC(nilai, mid+1, r);

        return Math.max(lmax, rmax);
    }

    int cariUtsTerendahDC(Nilai24[] nilai, int l, int r){
        if(l==r){
            return nilai[l].nilaiUTS;
        }

        int mid = (l+r)/2;
        int lmax = cariUtsTerendahDC(nilai, l, mid);
        int rmax = cariUtsTerendahDC(nilai, mid+1, r);

        return Math.min(lmax, rmax);
    }

    double cariRataUas(Nilai24[] nilai){
        int total = 0;
        for (Nilai24 n : nilai) {
            total += n.nilaiUAS;
        }
        double rata = total/nilai.length;
        return rata;
    }


}
