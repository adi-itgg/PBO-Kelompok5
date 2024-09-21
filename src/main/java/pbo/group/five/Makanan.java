package pbo.group.five;

public class Makanan extends Menu {
    // Atribut untuk kategori makanan (makanan ringan, makanan berat, dll)
    private String kategori;

    // Konstruktor untuk inisialisasi atribut
    public Makanan(String NamaMenu, double HargaMenu, String kategori) {
        super(NamaMenu, HargaMenu); // Panggil konstruktor superclass (Menu)
        this.kategori = kategori;
    }

    // Metode untuk menampilkan informasi makanan
    public void TampilkanInfoMakanan() {
        super.TampilkanInfoMenu(); // Panggil metode tampilkanInfoMenu dari superclass (Menu)
        System.out.println("Kategori: " + this.kategori);
    }
}
