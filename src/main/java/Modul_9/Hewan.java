package Modul_9;

public abstract class Hewan {

    void suara() {
        System.out.println("suara hewan-hewan");
    }
}
class Anjing extends Hewan {

    void suara() {
        System.out.println("gug gug");
    }
}
class Kucing extends Hewan {

    void suara() {
        System.out.println("meong-meong");
    }
}
class Bebek extends Hewan {

    void suara() {
        System.out.println("kwek-kwek");
    }
}

class Dino extends Hewan {

    void suara() {
        System.out.println("rawrrr");
    }
}
class MainHewan {

    public static void main(String[] args) {
        Hewan kewan;
        kewan = new Anjing();
        kewan.suara();
        kewan = new Kucing();
        kewan.suara();
        kewan = new Bebek();
        kewan.suara();
        kewan = new Dino();
        kewan.suara();
    }
}
