package pertemuan13.tugas1;

public class NodeQueue24 {
    Queue24 data;
    NodeQueue24 prev, next;

    public NodeQueue24(NodeQueue24 prev, Queue24 data, NodeQueue24 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
