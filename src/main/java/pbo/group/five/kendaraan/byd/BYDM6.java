package pbo.group.five.kendaraan.byd;

import pbo.group.five.kendaraan.Mobil;

public class BYDM6 extends Mobil {

    @Override
    public String nama() {
        return "BYD M6";
    }

    @Override
    public Long kapasitasBagasi() {
        return 180L;
    }

    @Override
    public String nomorPolisi() {
        return "B 9841 CNN";
    }

    @Override
    public String kodeModel() {
        return "BYDM6-CI123BA";
    }

}
