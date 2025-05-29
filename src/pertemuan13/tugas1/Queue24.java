package pertemuan13.tugas1;

public class Queue24 {
    int no;
    String nama;

    public Queue24(int no, String nama) {
        this.no = no;
        this.nama = nama;
    }

    void tampilkan(){
        System.out.println("|" + no + "\t" + "|" + nama + "\t" + "|");
    }
}