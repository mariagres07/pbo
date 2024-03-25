package Modul_3;//deklarasi package Modul_3

public class Titik {//deklarasi class Titik
    private int x, y;
    
    public Titik (int x, int y){//constructor
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}   
