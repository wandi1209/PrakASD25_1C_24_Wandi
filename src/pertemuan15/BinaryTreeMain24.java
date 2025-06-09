package pertemuan15;

public class BinaryTreeMain24 {
    public static void main(String[] args) {
        BinaryTree24 bst = new BinaryTree24();

        bst.add_24(new Mahasiswa24("244160121", "Ali", "A", 3.57));
        bst.add_24(new Mahasiswa24("244160221", "Badar", "B", 3.85));
        bst.add_24(new Mahasiswa24("244160185", "Candra", "C", 3.21));
        bst.add_24(new Mahasiswa24("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) : ");
        bst.traverseInOrder_24(bst.root);

        System.out.println("\nPencarian data mahasiswa : ");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find_24(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan IPK 3.22 : ");
        hasilCari = bst.find_24(3.22) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add_24(new Mahasiswa24("244160131", "Devi", "A", 3.72));
        bst.add_24(new Mahasiswa24("244160205", "Ehsan", "D", 3.37));
        bst.add_24(new Mahasiswa24("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa : ");
        System.out.println("InOrder Traversal");
        bst.traverseInOrder_24(bst.root);
        System.out.println("PreOrder Traversal");
        bst.traversePreOrder_24(bst.root);
        System.out.println("PostOrder Traversal");
        bst.traversePostOrder_24(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete_24(3.57);
        System.out.println("\nDaftar semua maahasiswa setelah penghapusan 1 mahasiswa (in order traversal)");
        bst.traverseInOrder_24(bst.root);

        bst.addRekursif_24(new Mahasiswa24("244160111", "Wandi", "A", 3.62));
        bst.addRekursif_24(new Mahasiswa24("244160112", "Fajar", "B", 3.41));
        bst.addRekursif_24(new Mahasiswa24("244160113", "Vina", "C", 3.75));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa dengan rekursif : ");
        bst.traverseInOrder_24(bst.root);
        
        bst.cariMinIpk();
        bst.cariMaxIpk();

        System.out.println("\nMahasiswa yang IPK dibawah 3.7");
        bst.tampilkanMahasiswaIPKdiAtas(bst.root, 3.7);
    }
}
