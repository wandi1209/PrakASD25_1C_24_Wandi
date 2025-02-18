package pertemuan2;

public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        if(sksBaru < 1) {
            System.out.println("SKS Tidak boleh dibawah 1");
        } else {
            sks = sksBaru;
        }
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void kurangiJam(int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam : " + jumlahJam);
        } else {
            System.out.println("Jumlah jam kurang dari " + jam + " jam, tidak dapat dikurangi.");
        }
    }
}
