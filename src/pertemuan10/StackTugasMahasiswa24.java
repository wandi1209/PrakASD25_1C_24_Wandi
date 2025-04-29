package pertemuan10;

public class StackTugasMahasiswa24 {
    Mahasiswa24[] stack;
    int top;
    int size;

    StackTugasMahasiswa24(int size){
        this.size = size;
        stack = new Mahasiswa24[size];
        top = -1;
    }

    public boolean isFull_24(){
        if(top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty_24(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push_24(Mahasiswa24 mhs){
        if(!isFull_24()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa24 pop_24(){
        if(!isEmpty_24()){
            Mahasiswa24 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa24 peek_24(){
        if(!isEmpty_24()){
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print_24(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
}
