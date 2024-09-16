package Modul_10;

import Modul_9.Pegawai;

public class Honorer extends Pegawai{
    
    public Honorer(){
        
    }

   @Override
    public String getEmail() {
        return getNpp() + "@honorer.usd.ac.id";
    }

    @Override
    public String getStatus() {
        return "Honorer";
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
