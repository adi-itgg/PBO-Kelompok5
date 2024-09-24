package pbo.group.five;

import pbo.group.five.base.Kendaraan;
import pbo.group.five.kendaraan.Mobil;
import pbo.group.five.kendaraan.Motor;
import pbo.group.five.kendaraan.SubsidiMotor;
import pbo.group.five.kendaraan.byd.BYDM6;
import pbo.group.five.kendaraan.polytron.PolytronFoxR;
import pbo.group.five.kendaraan.yamaha.YamahaGear125;

public class Vehicle {

    /**
     * Menampilkan detail data kendaraan.
     * @param kendaraan Kendaraan yang ingin ditampilkan datanya.
     */
    public static void tampilkanDataKendaraan(Kendaraan kendaraan) {
        System.out.println("Nama kendaraan: " + kendaraan.nama());
        System.out.println("Nomor Polisi: " + kendaraan.nomorPolisi());
        System.out.println("Kode Model: " + kendaraan.kodeModel());
    }

    public static void main(String[] args) {

        Mobil bydm6 = new BYDM6();
        tampilkanDataKendaraan(bydm6);
        System.out.println("Kapasitas Bagasi: " + bydm6.kapasitasBagasi());
        System.out.println();

        SubsidiMotor polytronFoxR = new PolytronFoxR();
        tampilkanDataKendaraan(polytronFoxR);
        System.out.println("Kapasitas Jok: " + polytronFoxR.kapasitasJok());
        System.out.println("kWh: " + polytronFoxR.kWhBaterai());
        System.out.println();

        Motor yamahaGear125 = new YamahaGear125();
        tampilkanDataKendaraan(yamahaGear125);
        System.out.println("Kapasitas Jok: " + yamahaGear125.kapasitasJok());

    }

}
