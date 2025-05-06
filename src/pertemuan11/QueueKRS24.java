package pertemuan11;

public class QueueKRS24 {
    Mahasiswa24[] mahasiswa;
    int front, rear, size, max, diproses = 0, maxProses = 30;

    public QueueKRS24(int n){
        this.max = n;
        this.mahasiswa = new Mahasiswa24[max];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public boolean isEmpty_24(){
        return size == 0;
    }

    public boolean isFull_24(){
        return size == max;
    }
    
    public void clear_24() {
        if(!isEmpty_24()){
            rear = -1;
            size = front = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void enqueue_24(Mahasiswa24 mhs){
        if(isFull_24()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        mahasiswa[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void dequeue_24(){
        if(size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        } else {
            for (int i = 0; i < 2; i++) {
                System.out.print(" - ");
                mahasiswa[front].tampilkanData_24();
                front = (front + 1) % max;
                size--;
                diproses++;
            }
        }
    }

    public void print_24(){
        if(isEmpty_24()){
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            mahasiswa[index].tampilkanData_24();
        }

    }

    public void lihatTerdepan_24(){
        if(isEmpty_24()){
            System.out.println("Antrian Kosong");
            return;
        } 

        System.out.println("Mahasiswa terdepan: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        if (size == 1) {
            mahasiswa[front].tampilkanData_24();
        } else {
            System.out.print("1. ");
            mahasiswa[front].tampilkanData_24();
            System.out.print("2. ");
            mahasiswa[(front + 1) % max].tampilkanData_24();
        }
    }

    public void lihatAkhir_24(){
        if(isEmpty_24()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            mahasiswa[rear].tampilkanData_24();
        }
    }

    public int getAntrian_24(){
        return size;
    }

    public int getDiproses_24(){
        return diproses;
    }

    public int getBelumDiproses_24(){
        return maxProses - diproses;
    }
}
