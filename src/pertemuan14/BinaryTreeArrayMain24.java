package pertemuan14;

public class BinaryTreeArrayMain24 {
    public static void main(String[] args) {
        BinaryTreeArray24 bta = new BinaryTreeArray24();
        Mahasiswa24 mhs1 =  new Mahasiswa24("244160121", "Ali", "A", 3.57);
        Mahasiswa24 mhs2 =  new Mahasiswa24("244160221", "Badar", "B", 3.85);
        Mahasiswa24 mhs3 =  new Mahasiswa24("244160185", "Candra", "C", 3.21);
        Mahasiswa24 mhs4 =  new Mahasiswa24("244160220", "Dewi", "D", 3.54);

        Mahasiswa24 mhs5 = new Mahasiswa24("244160131", "Devi", "A", 3.72);
        Mahasiswa24 mhs6 = new Mahasiswa24("244160205", "Ehsan", "D", 3.37);
        Mahasiswa24 mhs7 = new Mahasiswa24("244160170", "Fizi", "B", 3.46);

        Mahasiswa24[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData_24(dataMahasiswa, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder_24(0);
    }
}
