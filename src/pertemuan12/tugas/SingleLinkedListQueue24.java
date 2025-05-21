package pertemuan12.tugas;

public class SingleLinkedListQueue24 {
    NodeMahasiswaQueue24 front, rear;
    int max = 20, size = 0;

    boolean isEmpty_24(){
        return size == 0;
    }

    boolean isFull_24(){
        return size == max;
    }

    void clear_24(){
        size = 0;
        front = rear = null;
        System.out.println("Antrian berhasil dikosongksn.");
    }

    void enqueue_24(MahasiswaQueue24 input){
        if(isFull_24()){
            System.out.println("Antrian penuh.");
            return;
        }

        NodeMahasiswaQueue24 ndInput = new NodeMahasiswaQueue24(input, null);

        if(isEmpty_24()){
            front = rear = ndInput;
        } else {
            NodeMahasiswaQueue24 temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            rear.next = ndInput;
            rear = ndInput;
        }
        size++;
        System.out.println("Mahasiswa dengan nama " + input.nama + " masuk ke antrian.");
    }

    void dequeue_24(){
         if(isEmpty_24()){
            System.out.println("Antrian masih kosong.");
            return;
        }

        String namaDihapus = front.data.nama;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        System.out.println("Mahasiswa dengan nama " + namaDihapus + " dihapus dari antrian.");
        size--;
    }

    void print_24(){
        if(isEmpty_24()){
            System.out.println("Antrian masih kosong.");
            return;
        }
        NodeMahasiswaQueue24 temp = front;
        System.out.println("Seluruh mahasiswa yang sedang mengantri : ");
        for (int i = 0; i < size; i++) {
            temp.data.tampilkanInformasi_24();
            if(temp.next != null){
                temp = temp.next;
            }
        }
        
    }

    void peek_24(){
        if(isEmpty_24()){
            System.out.println("Antrian masih kosong.");
            return;
        }
        front.data.tampilkanInformasi_24();
    }

    void peek_last_24(){
        if(isEmpty_24()){
            System.out.println("Antrian masih kosong.");
            return;
        }
        rear.data.tampilkanInformasi_24();
    }

    int getTotalQueue(){
        return size;
    }

}
