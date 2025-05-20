package pertemuan12;

public class SingleLinkedList24 {
    NodeMahasiswa24 head, tail;

    boolean isEmpty_24(){
        return (head == null);
    }

    public void print_24(){
        if(!isEmpty_24()){
            NodeMahasiswa24 temp = head;
            System.out.println("Isi Linked List:\t");
            while (temp != null) { 
                temp.data.tampilkanInformasi_24();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst_24(Mahasiswa24 input){
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, null);
        if(isEmpty_24()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast_24(Mahasiswa24 input){
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, null);
        if(isEmpty_24()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter_24(String key, Mahasiswa24 input){
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, null);
        NodeMahasiswa24 temp = head;
        do { 
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt_24(int index, Mahasiswa24 input){
        if(index < 0){
            System.out.println("index salah");
        } else if (index == 0){
            addFirst_24(input);
        } else {
            NodeMahasiswa24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa24(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    public void getData_24(int index){
        NodeMahasiswa24 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilkanInformasi_24();
    }

    public int indexOf_24(String key){
        NodeMahasiswa24 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) { 
            temp = temp.next;
            index++;
        }

        if(temp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst_24() {
        if(isEmpty_24()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast_24(){
        if(isEmpty_24()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa24 temp = head;
            while (temp.next != tail) { 
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove_24(String key){
        if(isEmpty_24()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa24 temp = head;
            while (temp != null) {
                if((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                    removeLast_24();
                    break;
                } else if(temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt_24(int index){
        if(index == 0){
            removeFirst_24();
        } else {
            NodeMahasiswa24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}
