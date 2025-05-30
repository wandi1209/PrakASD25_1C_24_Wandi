package pertemuan13.tugas2;

public class DLLFilm24 {
    NodeFilm24 head = null;
    int size = 0;

    boolean isEmpty_24(){
        return  head == null;
    }

    void addFirst_24(Film24 data){
        NodeFilm24 ndInput = new NodeFilm24(null, data, head);
        if(isEmpty_24()){
            head = ndInput;
        } else {
            head.prev = ndInput;
            head = ndInput;
        }
        size++;
    }

    void addLast_24(Film24 data){
        NodeFilm24 ndInput = new NodeFilm24(null, data, null);
        if(isEmpty_24()){
            head = ndInput;
        } else {
            NodeFilm24 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ndInput;
            ndInput.prev = temp;
        }
        size++;
    }

    void insertAt_24(int index, Film24 data){
        NodeFilm24 ndInput = new NodeFilm24(null, data, null);

        if(index < 0 || index > size) {
            System.out.println("Masukkan index yang sesuai.");
            return;
        }

        if(index == 0){
            addFirst_24(data);
        } else if (index == size) {
            addLast_24(data);
        } else {
            NodeFilm24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            ndInput.prev = temp;
            ndInput.next = temp.next;
            temp.next.prev = ndInput;
            temp.next = ndInput;
            size++;
        }
    }

    void removeFirst_24(){
        if(isEmpty_24()){
            System.out.println("List film masih kosong.");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            head.next.prev = null;
            head = head.next;
            size--;
        }
    }

    void removeLast_24(){
        if(isEmpty_24()){
            System.out.println("List film masih kosong.");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            NodeFilm24 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    void removeAt_24(int index){
        if(isEmpty_24()){
            System.out.println("List film masih kosong.");
            return;
        } else if (index < 0 || index >= size){
            System.out.println("Masukkan index yang sesuai.");
            return;
        }

        if (index == 0) {
            removeFirst_24();
        } else if (index == size - 1) {
            removeLast_24();
        } else {
            NodeFilm24 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            size--;
        }
    }

    void print_24(){
        if(isEmpty_24()){
            System.out.println("List film masih kosong.");
        } else {
            NodeFilm24 temp = head;
            System.out.println("Cetak Data");
            while (temp != null) {
                temp.data.tampilkan_24();
                temp = temp.next;
            }
        }
    }

    Film24 cariFilm_24(int id){
        if(isEmpty_24()){
            System.out.println("List film masih kosong.");
            return null;
        }
        NodeFilm24 temp = head;
        while (temp != null) {
            if(temp.data.id == id){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    void sortingByRating() {
        if (isEmpty_24()) {
            System.out.println("List film masih kosong.");
            return;
        }

        Film24[] filmArray = new Film24[size];
        NodeFilm24 current = head;
        int i = 0;
        while (current != null) {
            filmArray[i++] = current.data;
            current = current.next;
        }

        for (int j = 0; j < filmArray.length - 1; j++) {
            for (int k = 0; k < filmArray.length - j - 1; k++) {
                if (filmArray[k].rating < filmArray[k + 1].rating) {
                    Film24 temp = filmArray[k];
                    filmArray[k] = filmArray[k + 1];
                    filmArray[k + 1] = temp;
                }
            }
        }

        System.out.println("Sorting Berdasarkan Rating - DESC");
        for (Film24 film : filmArray) {
            film.tampilkan_24();
        }
    }

}
