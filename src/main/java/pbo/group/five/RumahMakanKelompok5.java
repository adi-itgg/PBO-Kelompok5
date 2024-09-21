package pbo.group.five;

import pbo.group.five.base.RumahMakan;

public class RumahMakanKelompok5 extends RumahMakan {

    // Atribut untuk daftar menu makanan
    private final Makanan[] daftarMakanan;

    // Atribut untuk daftar menu minuman
    private final Minuman[] daftarMinuman;

    // Konstruktor untuk inisialisasi atribut
    public RumahMakanKelompok5(String namaRumahMakan, Makanan[] daftarMakanan, Minuman[] daftarMinuman) {
        super(namaRumahMakan); // Panggil konstruktor superclass (RumahMakan)
        this.daftarMakanan = daftarMakanan;
        this.daftarMinuman = daftarMinuman;
    }

    // Metode untuk menampilkan informasi rumah makan dan menu
    public void tampilkanInfo() {
        super.tampilkanInfoRumahMakan(); // Panggil metode tampilkanInfoRumahMakan dari superclass (RumahMakan)
        System.out.println("Jumlah Menu Makanan: " + this.daftarMakanan.length);
        System.out.println("Jumlah Menu Minuman: " + this.daftarMinuman.length);
        System.out.println("Daftar Menu Makanan:");
        for (Makanan makanan : daftarMakanan) {
            makanan.TampilkanInfoMakanan();
            System.out.println();
        }
        System.out.println("Daftar Menu Minuman:");
        for (Minuman minuman : daftarMinuman) {
            minuman.tampilkanInfoMinuman();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Buat objek makanan dan minuman
        Makanan[] daftarMakanan = new Makanan[5];
        daftarMakanan[0] = new Makanan("Nasi Goreng", 15000.0, "Makanan Berat");
        daftarMakanan[1] = new Makanan("Nasi Ayam Geprek", 22000.0, "Makanan Berat");
        daftarMakanan[2] = new Makanan("Kentang Goreng", 20000.0, "Makanan Ringan");
        daftarMakanan[3] = new Makanan("Otak-Otak Goreng", 15000.0, "Makanan Ringan");
        daftarMakanan[4] = new Makanan("Bakso", 15000.0, "Makanan Berat");

        Minuman[] daftarMinuman = new Minuman[5];
        daftarMinuman[0] = new Minuman("Teh Hangat", 3000.0, "Medium");
        daftarMinuman[1] = new Minuman("Teh Dingin", 5000.0, "Medium");
        daftarMinuman[2] = new Minuman("Air Jeruk Hangat", 5000.0, "Medium");
        daftarMinuman[3] = new Minuman("Air Jeruk Dingin", 7000.0, "Medium");
        daftarMinuman[4] = new Minuman("Air Mineral", 3000.0, "Medium");

        // Buat objek rumah makan
        RumahMakanKelompok5 rumahMakan = new RumahMakanKelompok5("Rumah Makan Kelompok5", daftarMakanan, daftarMinuman);

        // Tampilkan informasi rumah makan dan menu
        rumahMakan.tampilkanInfo();
    }

}
