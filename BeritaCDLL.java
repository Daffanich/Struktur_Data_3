import java.util.Scanner;

class Node {
    String data;
    Node next, prev;

    Node (String data){
        this.data = data;
        this.next = this.prev = null;
    }
}

class CircularDoublyLinkedList{
    Node head = null;

    public void insert(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;    
        }
    
        System.out.println("berita berhasil ditambahkan!");
    }



public void delete(int posisi) {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }

        Node current = head;
        int count = 1;

        if (posisi == 1) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head.prev;
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            System.out.println("Berita berhasil dihapus.");
            return;
        }

        do {
            if (count == posisi) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                System.out.println("Berita berhasil dihapus.");
                return;
            }
            current = current.next;
            count++;
        } while (current != head);

        System.out.println("Nomor tidak ditemukan.");
    }

    public void tampilForward() throws InterruptedException {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }

        Node temp = head;
        do {
            System.out.println(temp.data);
            Thread.sleep(3000);
            temp = temp.next;
        } while (temp != head);
    }

    public void tampilBackward() throws InterruptedException {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }

        Node temp = head.prev;
        Node tail = temp;

        do {
            System.out.println(temp.data);
            Thread.sleep(3000);
            temp = temp.prev;
        } while (temp != tail);
    }

    public void tampilTertentu(int posisi) {
        if (head == null) {
            System.out.println("List kosong.");
            return;
        }

        Node temp = head;
        int count = 1;

        do {
            if (count == posisi) {
                System.out.println("Berita: " + temp.data);
                return;
            }
            temp = temp.next;
            count++;
        } while (temp != head);

        System.out.println("Nomor tidak ditemukan.");
    }
}

public class BeritaCDLL {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert berita");
            System.out.println("2. Hapus berita");
            System.out.println("3. Tampilkan forward");
            System.out.println("4. Tampilkan backward");
            System.out.println("5. Tampil berita tertentu");
            System.out.println("6. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan berita: ");
                    String berita = sc.nextLine();
                    list.insert(berita);
                    break;
                case 2:
                    System.out.print("Nomor urut yang dihapus: ");
                    int hapus = sc.nextInt();
                    list.delete(hapus);
                    break;
                case 3:
                    list.tampilForward();
                    break;
                case 4:
                    list.tampilBackward();
                    break;
                case 5:
                    System.out.print("Nomor urut: ");
                    int nomor = sc.nextInt();
                    list.tampilTertentu(nomor);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 6);

        sc.close();
    }
}