Simulasi Teks Berita Berjalan (Circular Doubly Linked List)
Repositori ini berisi implementasi program simulasi teks berita berjalan (seperti running text di televisi) menggunakan struktur data Circular Doubly Linked List secara manual. Program tersedia dalam dua bahasa pemrograman: Java dan Python.

Fitur Program
Program ini menyediakan menu interaktif untuk mengelola urutan berita dengan fitur-fitur sebagai berikut:

Insert Berita: Menambahkan teks berita baru yang secara otomatis diletakkan di akhir list.

Hapus Berita: Menghapus berita tertentu berdasarkan nomor urut posisi dalam list.

Tampilkan Forward: Menampilkan seluruh berita secara berurutan dari depan ke belakang dengan jeda waktu (delay) 3 detik antar berita. Karena menggunakan Circular List, tampilan akan kembali ke awal setelah mencapai akhir.

Tampilkan Backward: Menampilkan seluruh berita secara urutan terbalik dari belakang ke depan dengan jeda waktu (delay) 3 detik.

Tampil Berita Tertentu: Mencari dan menampilkan teks berita pada posisi/nomor urut tertentu.

Exit: Keluar dari program.

Spesifikasi Teknis
Struktur Data: Menggunakan Circular Doubly Linked List di mana setiap node memiliki pointer next dan prev, serta node terakhir terhubung kembali ke node pertama.

Manual Implementation: Tidak menggunakan library bawaan seperti java.util.LinkedList atau modul eksternal Python untuk struktur datanya.

Delay System: Menggunakan Thread.sleep(3000) pada Java dan time.sleep(3) pada Python untuk mensimulasikan efek teks berjalan.

Struktur File
BeritaCDLL.java: Source code utama dalam bahasa Java.

berita_cdll.py: Source code utama dalam bahasa Python.

prompt_ai.txt: Catatan instruksi yang digunakan jika menggunakan bantuan pengembangan AI.

README.md: Dokumentasi tugas.

Demo Program
Anda dapat melihat simulasi dan penjelasan cara kerja program melalui tautan video berikut:

Link Video:

Penggunaan AI
Program ini dikembangkan dengan bantuan asisten AI untuk optimasi logika struktur data.

Tools: Gemini AI (Google).

Prompt: Detail instruksi lengkap dapat dilihat pada file prompt_ai.txt.

Cara Menjalankan
untuk Java:

1. Pastikan Java JDK sudah terinstall di perangkat Anda.
2. Buka terminal/command prompt.
3. Compile file: javac BeritaCDLL.java
4. Jalankan program: java BeritaCDLL

untuk Python:

1. Pastikan Python 3.x sudah terinstall.
2. Buka terminal/command prompt.
3. Jalankan program: python berita_cdll.py
