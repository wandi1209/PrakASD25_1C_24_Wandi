package pertemuan11;

public class AntrianLayanan24 {
    Mahasiswa24[] data;
    int front, rear, size, max;

    public AntrianLayanan24(int n){
        this.max = n;
        this.data = new Mahasiswa24[max];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public boolean isEmpty_24(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull_24(){
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan_24(){
        if(isEmpty_24()){
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData_24();
        }
    }

    public void tampilkanSemua(){
        if(isEmpty_24()){
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData_24();
        }

    }

    public void clear_24() {
        if(!isEmpty_24()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }
    }

    public void tambahAntrian_24(Mahasiswa24 mhs){
        if(isFull_24()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa24 layaniMahasiswa_24(){
        if(isEmpty_24()){
            System.out.println("Queue masih kosong");
            return null;
        }
        Mahasiswa24 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian(){
        return size;
    }
}
