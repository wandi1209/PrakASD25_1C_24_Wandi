package pertemuan13;

public class DoubleLinkedListsMain24 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists24 dll = new DoubleLinkedLists24();
        dll.print_24();
        System.out.println("Size : " + dll.size_24());
        System.out.println("===================================");
        dll.addFirst_24(3);
        dll.addLast_24(4);
        dll.addFirst_24(7);
        dll.print_24();
        System.out.println("Size : " + dll.size_24());
        System.out.println("===================================");
        dll.add_24(40, 1);
        dll.print_24();
        System.out.println("Size : " + dll.size_24());
        System.out.println("===================================");
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst_24());
        System.out.println("Data akhir pada Linked Lists adalah : " + dll.getLast_24());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get_24(1));
    }
}
