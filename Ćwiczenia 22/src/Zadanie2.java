public class Zadanie2 {
    public static void main(String[] args) {
        Spawacz spawacz = new Spawacz("Stanisław",15);
        System.out.println(spawacz.getStazpracy());
        spawacz.wyswietl();
    }
}
class Osoba{
    private String imie;

    public Osoba(String imie){
        this.imie = imie;
    }

    public String wyswietl(){
        return imie;
    }
}
class Spawacz
        extends Osoba{
    private int stazpracy;

    public Spawacz(String imie, int stazpracy) {
        super(imie);
        this.stazpracy = stazpracy;
    }

    //nie robić tego — bo neguje istnienie podstawy

    /*
    public Spawacz(Osoba osoba, int stazpracy){
        super(osoba.wyswietl());
        this.stazpracy = stazpracy;
    }

     */

    public int getStazpracy() {
        return stazpracy;
    }

    public String wyswietl(){
        System.out.println(super.wyswietl()+ " " + stazpracy);
        //metoda wyświetl — jest z klasy bazowej — odwołanie do klasy bazowej
        return super.wyswietl() + " " + stazpracy;
    }
}