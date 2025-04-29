package pertemuan10;

public class StackKonversi24 {
    int[] tumpukanBiner;
    int size, top;

    public StackKonversi24(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty_24(){
        return top == -1;
    }

    public boolean isFull_24(){
        return top == size - 1;
    }

    public void push_24(int data){
        if(isFull_24()){
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop_24(){
        if(isEmpty_24()){
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
