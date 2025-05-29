package pertemuan13.tugas1;

public class DLLQueue {
    NodeQueue24 head;
    int size;

    public DLLQueue() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty_24(){
        return size == 0;
    }

    void enqueue_24(Queue24 data){
        NodeQueue24 ndInput = new NodeQueue24(null, data, null);
        if(isEmpty_24()){
            head = ndInput;
        } else {
            NodeQueue24 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ndInput;
            ndInput.prev = temp;
        }
        size++;
    }

    void dequeue_24(){
        String nama = "";
        if(isEmpty_24()){
            System.out.println("Antriann masih kosong.");
            return;
        } else if (head.next == null){
            nama = head.data.nama;
            head = null;
        } else {
            head.next.prev = null;
            nama = head.data.nama;
            head = head.next;
        }
        size--;
        System.out.println(nama + "telah selesai di vaksinasi.");
    }

    void print_24(){
        if(isEmpty_24()){
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            NodeQueue24 temp = head;
            while (temp.next != null) { 
                temp.data.tampilkan();
                temp = temp.next;
            }
            System.out.println("Sisa Anttrian : " + size);
        }
    }
}
