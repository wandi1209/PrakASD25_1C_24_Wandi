package pertemuan2;

public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah24(){
        
    }
    public MataKuliah24(String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

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
    }

    void kurangiJam(int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam kurang dari " + jam + " jam, tidak dapat dikurangi.");
        }
    }
}
