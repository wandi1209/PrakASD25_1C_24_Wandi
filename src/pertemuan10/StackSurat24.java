package pertemuan10;

public class StackSurat24 {
    Surat24[] stack;
    int size;
    int top;

    public StackSurat24(int size) {
        stack = new Surat24[size];
        this.size = size;
        top = -1;
    }

    boolean isEmpty_24(){
        return top == -1;
    }

    boolean isFull_24(){
        return top == size - 1;
    }

    void push_24(Surat24 surat){
        if(!isFull_24()){
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh! Tidak bisa tambah data lagi.");
        }
    }

    Surat24 pop_24(){
        if(!isEmpty_24()){
            Surat24 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat yang bisa diverifikasi.");
            return null; 
        }
    }
    
    Surat24 peek_24(){
        if(!isEmpty_24()){
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada surat yang bisa dilihat.");
            return null;
        }
    }

    Surat24 find_24(String cari){
        if(!isEmpty_24()){
            for (int i = top; i >= 0; i--) {
                if(cari.equalsIgnoreCase(stack[i].namaMahasiswa)){
                    return stack[i];
                }
            }
        } 
        return null;
    }
}
