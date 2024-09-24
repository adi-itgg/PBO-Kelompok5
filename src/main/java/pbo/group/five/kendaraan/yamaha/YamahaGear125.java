package pbo.group.five.kendaraan.yamaha;

import pbo.group.five.kendaraan.Motor;

public class YamahaGear125 extends Motor {

    @Override
    public String nama() {
        return "Gear 125";
    }

    @Override
    public Long kapasitasJok() {
        return 18L;
    }

    @Override
    public String nomorPolisi() {
        return "B 7381 UPS";
    }

    @Override
    public String kodeModel() {
        return "GEAR125-CFUI123BF9";
    }

}
