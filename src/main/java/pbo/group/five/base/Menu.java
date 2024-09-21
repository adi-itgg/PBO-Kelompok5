package pbo.group.five.base;

public abstract class Menu {

    // Atribut untuk nama menu
    protected String namaMenu;

    // Atribut untuk harga menu
    protected double hargaMenu;

    // Konstruktor untuk inisialisasi atribut
    public Menu(String namaMenu, double hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    // Metode untuk menampilkan informasi menu
    public void tampilkanInfoMenu() {
        System.out.println("Nama Menu: " + this.namaMenu);
        System.out.println("Harga Menu: " + this.hargaMenu);
    }

}
