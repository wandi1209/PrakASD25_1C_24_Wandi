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
        dll.clear_24();
        dll.print_24();
        System.out.println("Size : " + dll.size_24());
    }
}
