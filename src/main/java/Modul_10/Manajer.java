package Modul_10;

import Modul_9.Pegawai;

public class Manajer extends Pegawai{

    public Manajer() {
        
    }

    @Override
    public String getEmail() {
        return getNpp() + "@manajer.usd.ac.id";
    }

    @Override
    public String getStatus() {
        return "Manajer";
    }

    @Override
    public double getTunjangan() {
        return 100000;
    }

    @Override
    public double hitungGaTot() {
        return getGapok() + getTunjangan();
    } 
}
