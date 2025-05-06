package pertemuan11;

public class Queue24 {
    int[] data;
    int front, rear, size, max;

    public Queue24(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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

    public void peek_24(){
        if(!isEmpty_24()){
            System.out.println("Elemen Terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }
    }

    public void print_24(){
        if(isEmpty_24()){
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
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

    public void enqueue_24(int dt){
        if(isFull_24()){
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if(isEmpty_24()){
                front = rear = 0;
            } else {
                if(rear == max -1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue_24(){
        int dt = 0;
        if(isEmpty_24()){
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if(isEmpty_24()){
                front = rear = -1;
            } else {
                if(front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
