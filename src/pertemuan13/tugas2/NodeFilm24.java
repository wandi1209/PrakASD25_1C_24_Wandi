package pertemuan13.tugas2;

public class NodeFilm24 {
    Film24 data;
    NodeFilm24 prev, next;

    public NodeFilm24(NodeFilm24 prev, Film24 data,  NodeFilm24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
}
