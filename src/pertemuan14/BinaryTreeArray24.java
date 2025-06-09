package pertemuan14;

public class BinaryTreeArray24 {
    Mahasiswa24[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray24() {
        this.dataMahasiswa = new Mahasiswa24[10];
    }

    void populateData_24(Mahasiswa24 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder_24(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder_24(2*idxStart+1);
                dataMahasiswa[idxStart].tampilkanInformasi();
                traverseInOrder_24(2*idxStart+2);
            }
        }
    }
}
