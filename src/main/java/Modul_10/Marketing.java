package Modul_10;

import Modul_9.Pegawai;

public class Marketing extends Pegawai{
    
    public Marketing(){
        
    }

    @Override
    public String getEmail() {
        return getNpp() + "@marketing.usd.ac.id";
    }

    @Override
    public String getStatus() {
        return "Marketing";
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
