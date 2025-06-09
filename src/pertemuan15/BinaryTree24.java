package pertemuan15;

public class BinaryTree24 {
    Node24 root;

    public BinaryTree24() {
        root = null;
    }

    boolean isEmpty_24(){
        return root == null;
    }

    void add_24(Mahasiswa24 mahasiswa){
        Node24 newNode = new Node24(mahasiswa);
        if(isEmpty_24()){
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while (true) {
                parent = current;
                if(mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find_24(double ipk){
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            }else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            }else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder_24(Node24 node){
        if(node != null){
            node.mahasiswa.tampilkanInformasi();
            traversePreOrder_24(node.left);
            traversePreOrder_24(node.right);
        }
    }

    void traverseInOrder_24(Node24 node){
        if(node != null){
            traverseInOrder_24(node.left);
            node.mahasiswa.tampilkanInformasi();
            traverseInOrder_24(node.right);
        }
    }

    void traversePostOrder_24(Node24 node){
        if(node != null){
            traversePostOrder_24(node.left);
            traversePostOrder_24(node.right);
            node.mahasiswa.tampilkanInformasi();
        }
    }

    Node24 getSuccessor_24(Node24 del){
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete_24(double ipk){
        if(isEmpty_24()){
            System.out.println("Binary Tree Kosong.");
            return;
        }
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if(current.mahasiswa.ipk == ipk){
                break;
            } else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if(current == null){
            System.out.println("Data tidak ditemukan");
        } else {
            if (current.left == null && current.right == null) {
                if(current == root){
                    root = null;
                } else {
                    if(isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null){
                if(current == root){
                    parent = parent.right;
                }else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null){
                if(current == root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node24 successor = getSuccessor_24(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilkanInformasi();
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRekursif_24(Mahasiswa24 mhs){
        root = rekursif_24(root, mhs);
    }

    Node24 rekursif_24(Node24 current, Mahasiswa24 mhs){
        if(current == null){
            return new Node24(mhs);
        }
        if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = rekursif_24(current.left, mhs);
        } else {
            current.right = rekursif_24(current.right, mhs);
        }
        return current;
    }

    void cariMinIpk(){
        if(isEmpty_24()){
            System.out.println("Tree masih ksosng.");
            return;
        }
        Node24 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa denngan IPK terkecil : ");
        current.mahasiswa.tampilkanInformasi();
    }

    void cariMaxIpk(){
        if(isEmpty_24()){
            System.out.println("Tree masih ksosng.");
            return;
        }
        Node24 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa denngan IPK terbesar : ");
        current.mahasiswa.tampilkanInformasi();
    }

    void tampilkanMahasiswaIPKdiAtas(Node24 current, double ipkBatas){
        if(current != null){
            tampilkanMahasiswaIPKdiAtas(current.left, ipkBatas);
            if(current.mahasiswa.ipk > ipkBatas){
                current.mahasiswa.tampilkanInformasi();
            }
            tampilkanMahasiswaIPKdiAtas(current.right, ipkBatas);
        }
    }
}
