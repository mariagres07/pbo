package Modul_10;

public class MainPegawai {

    public static void main(String[] args) {
        Marketing marketing = new Marketing();
        Honorer honorer = new Honorer();
        Manajer manajer = new Manajer();

        marketing.setNpp(234785871);
        honorer.setNpp(234324341);
        manajer.setNpp(231351414);

        System.out.println("email = " + marketing.getEmail());
        System.out.println("email = " + honorer.getEmail());
        System.out.println("email = " + manajer.getEmail());
    }
}
