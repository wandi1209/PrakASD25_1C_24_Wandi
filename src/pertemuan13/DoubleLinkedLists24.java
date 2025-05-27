package pertemuan13;

public class DoubleLinkedLists24 {
    Node24 head;
    int size;

    public DoubleLinkedLists24() {
        head = null;
        size = 0;
    }

    public boolean isEmpty_24(){
        return head == null;
    }

    public void addFirst_24(int item){
        if(isEmpty_24()){
            head = new Node24(null, item, null);
        } else {
            Node24 newNode = new Node24(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast_24(int item){
        if(isEmpty_24()){
            addFirst_24(item);
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node24 newNode = new Node24(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add_24(int item, int index) throws Exception {
        if(isEmpty_24()){
            addFirst_24(item);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node24 newNode = new Node24(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node24 newNode = new Node24(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size_24(){
        return size;
    }

    public void clear_24(){
        head = null;
        size = 0;
    }

    public void print_24(){
        if(!isEmpty_24()){
            Node24 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst_24() throws Exception {
        if(isEmpty_24()){
            throw new Exception("Linked List masih kosongg. tidak dapat dihapus.");
        } else if(size == 1) {
            removeLast_24();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast_24() throws Exception {
        if (isEmpty_24()) {
            throw new Exception("Linked List masih kosongg. tidak dapat dihapus.");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        } 
        Node24 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove_24(int index) throws Exception {
        if (isEmpty_24() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if(index == 0){
            removeFirst_24();
        } else {
            Node24 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
}
