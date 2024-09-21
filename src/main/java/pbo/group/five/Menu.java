package pbo.group.five;

public class Menu {

    // Atribut untuk nama menu
    protected String NamaMenu;

    // Atribut untuk harga menu
    protected double HargaMenu;

    // Konstruktor untuk inisialisasi atribut
    public Menu(String NamaMenu, double HargaMenu) {
        this.NamaMenu = NamaMenu;
        this.HargaMenu = HargaMenu;
    }

    // Metode untuk menampilkan informasi menu
    public void TampilkanInfoMenu() {
        System.out.println("Nama Menu: " + this.NamaMenu);
        System.out.println("Harga Menu: " + this.HargaMenu);
    }

}
