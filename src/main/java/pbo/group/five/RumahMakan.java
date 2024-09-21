package pbo.group.five;

public class RumahMakan {
    // Atribut untuk nama rumah makan
    protected String NamaRumahMakan;

    // Konstruktor untuk inisialisasi atribut
    public RumahMakan(String NamaRumahMakan) {
        this.NamaRumahMakan = NamaRumahMakan;
    }

    // Metode untuk menampilkan informasi rumah makan
    public void TampilkanInfoRumahMakan() {
        System.out.println("Nama Rumah Makan: " + this.NamaRumahMakan);
    }
}
