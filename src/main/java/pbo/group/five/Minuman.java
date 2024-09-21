package pbo.group.five;

import pbo.group.five.base.Menu;

public class Minuman extends Menu {

    // Atribut untuk ukuran minuman (small, medium, large, dll)
    private final String ukuran;

    // Konstruktor untuk inisialisasi atribut
    public Minuman(String namaMenu, double hargaMenu, String ukuran) {
        super(namaMenu, hargaMenu); // Panggil konstruktor superclass (Menu)
        this.ukuran = ukuran;
    }

    // Metode untuk menampilkan informasi minuman
    public void tampilkanInfoMinuman() {
        super.tampilkanInfoMenu(); // Panggil metode tampilkanInfoMenu dari superclass (Menu)
        System.out.println("Ukuran: " + this.ukuran);
    }

}
