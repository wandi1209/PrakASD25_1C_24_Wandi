package pertemuan13.tugas2;

public class Film24 {
    int id;
    String judul;
    double rating;

    public Film24(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    void tampilkan_24(){
        System.out.println("ID : " + id);
        System.out.println(" Judul Film : " + judul);
        System.out.println(" Rating : " + rating);
    }
}
