package pbo.group.five.kendaraan.polytron;

import pbo.group.five.kendaraan.SubsidiMotor;

public class PolytronFoxR extends SubsidiMotor {

    @Override
    public String nama() {
        return super.nama() + " Fox R";
    }

    @Override
    public Long kapasitasJok() {
        return 5L;
    }

    @Override
    public Double kWhBaterai() {
        return 3.7;
    }

}
