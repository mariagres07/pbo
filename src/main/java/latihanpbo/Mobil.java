package latihanpbo;

public class Mobil {
    String merk;
    String warna;

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this. warna = warna;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
}
