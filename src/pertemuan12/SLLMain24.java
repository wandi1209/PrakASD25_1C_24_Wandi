package pertemuan12;

public class SLLMain24 {
    public static void main(String[] args) {
        SingleLinkedList24 sll = new SingleLinkedList24();
        Mahasiswa24 mhs1 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa24 mhs2 = new Mahasiswa24("23212201", "Bimon", "2B", 3.8);
        Mahasiswa24 mhs3 = new Mahasiswa24("22212202", "Cintia", "3C", 3.5);
        Mahasiswa24 mhs4 = new Mahasiswa24("21212203", "Dirga", "4D", 3.6);

        sll.print_24();
        sll.addFirst_24(mhs4);
        sll.print_24();
        sll.addLast_24(mhs1);
        sll.print_24();
        sll.insertAfter_24("Dirga", mhs3);
        sll.insertAt_24(2, mhs2);
        sll.print_24();
    }
}
