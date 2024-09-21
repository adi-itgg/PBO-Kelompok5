package pbo.group.five.base;

public abstract class RumahMakan {

    // Atribut untuk nama rumah makan
    protected String namaRumahMakan;

    // Konstruktor untuk inisialisasi atribut
    public RumahMakan(String namaRumahMakan) {
        this.namaRumahMakan = namaRumahMakan;
    }

    // Metode untuk menampilkan informasi rumah makan
    public void tampilkanInfoRumahMakan() {
        System.out.println("Nama Rumah Makan: " + this.namaRumahMakan);
    }

}
