package pbo.group.five;

import pbo.group.five.base.Menu;

public class Makanan extends Menu {

    // Atribut untuk kategori makanan (makanan ringan, makanan berat, dll)
    private final String kategori;

    // Konstruktor untuk inisialisasi atribut
    public Makanan(String namaMenu, double hargaMenu, String kategori) {
        super(namaMenu, hargaMenu); // Panggil konstruktor superclass (Menu)
        this.kategori = kategori;
    }

    // Metode untuk menampilkan informasi makanan
    public void TampilkanInfoMakanan() {
        super.tampilkanInfoMenu(); // Panggil metode tampilkanInfoMenu dari superclass (Menu)
        System.out.println("Kategori: " + this.kategori);
    }

}
