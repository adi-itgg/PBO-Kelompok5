package pbo.group.five;

public class Minuman extends Menu {
    // Atribut untuk ukuran minuman (small, medium, large, dll)
    private String ukuran;

    // Konstruktor untuk inisialisasi atribut
    public Minuman(String NamaMenu, double HargaMenu, String ukuran) {
        super(NamaMenu, HargaMenu); // Panggil konstruktor superclass (Menu)
        this.ukuran = ukuran;
    }

    // Metode untuk menampilkan informasi minuman
    public void TampilkanInfoMinuman() {
        super.TampilkanInfoMenu(); // Panggil metode tampilkanInfoMenu dari superclass (Menu)
        System.out.println("Ukuran: " + this.ukuran);
    }
}
