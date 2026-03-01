import time

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class CircularDoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            new_node.next = new_node
            new_node.prev = new_node
        else:
            tail = self.head.prev
            tail.next = new_node
            new_node.prev = tail
            new_node.next = self.head
            self.head.prev = new_node

        print("Berita berhasil ditambahkan.")

    def delete(self, posisi):
        if self.head is None:
            print("List kosong.")
            return

        current = self.head
        count = 1

        if posisi == 1:
            if self.head.next == self.head:
                self.head = None
            else:
                tail = self.head.prev
                self.head = self.head.next
                self.head.prev = tail
                tail.next = self.head
            print("Berita berhasil dihapus.")
            return

        while True:
            if count == posisi:
                current.prev.next = current.next
                current.next.prev = current.prev
                print("Berita berhasil dihapus.")
                return
            current = current.next
            count += 1
            if current == self.head:
                break

        print("Nomor tidak ditemukan.")


    def tampil_forward(self):
        if self.head is None:
            print("List kosong.")
            return

        current = self.head
        while True:
            print(current.data)
            time.sleep(3)
            current = current.next
            if current == self.head:
                break


    def tampil_backward(self):
        if self.head is None:
            print("List kosong.")
            return

        current = self.head.prev
        start = current

        while True:
            print(current.data)
            time.sleep(3)
            current = current.prev
            if current == start:
                break

    def tampil_tertentu(self, posisi):
        if self.head is None:
            print("List kosong.")
            return

        current = self.head
        count = 1

        while True:
            if count == posisi:
                print("Berita:", current.data)
                return
            current = current.next
            count += 1
            if current == self.head:
                break

        print("Nomor tidak ditemukan.")


def main():
    cdll = CircularDoublyLinkedList()

    while True:
        print("\n=== MENU ===")
        print("1. Insert berita")
        print("2. Hapus berita")
        print("3. Tampilkan forward")
        print("4. Tampilkan backward")
        print("5. Tampil berita tertentu")
        print("6. Exit")

        pilih = int(input("Pilih: "))

        if pilih == 1:
            berita = input("Masukkan berita: ")
            cdll.insert(berita)

        elif pilih == 2:
            nomor = int(input("Nomor urut yang dihapus: "))
            cdll.delete(nomor)

        elif pilih == 3:
            cdll.tampil_forward()

        elif pilih == 4:
            cdll.tampil_backward()

        elif pilih == 5:
            nomor = int(input("Nomor urut: "))
            cdll.tampil_tertentu(nomor)

        elif pilih == 6:
            print("Program selesai.")
            break

        else:
            print("Pilihan tidak valid.")


if __name__ == "__main__":
    main()