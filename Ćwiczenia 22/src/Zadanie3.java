public class Zadanie3 {
    public static void main(String[] args) {

        CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy("czerwony",2,15000);

        ciagnikSiodlowy.rozpocznijJazde();
    }
}
class Pojazd{
    private String color;

    public Pojazd(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class PojazdKolowy
        extends Pojazd{
    private int iloscOsi;


    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }
    /*

    NIE ROBIĆ TEGO!

    public PojazdKolowy(Pojazd pojazd, int iloscOsi){
        super(pojazd.getColor());
        this.iloscOsi = iloscOsi;
    }
     */

    // musimy zrobić getter, bo zmienna iloscOsi jest prywatna!
    public int getIloscOsi() {
        return iloscOsi;
    }
}

class CiagnikSiodlowy
        extends PojazdKolowy{
    //nie chcemy, żeby jakaś klasa z góry nam zmodyfikowała masę
    //dlatego private — bo chcemy by nikt nie miał do niego dostępu
    private double masa;


    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    /*

    NIE ROBIĆ TEGO!

    public CiagnikSiodlowy(PojazdKolowy pojazdKolowy, double masa){
        super(pojazdKolowy.getColor(),pojazdKolowy.getIloscOsi());
        this.masa = masa;
    }
     */



    //final — nikt dalej nie będzie mógł jej przedefiniowywać
    final public void rozpocznijJazde(){
        double max_masa_os = 11000;
        //odwołujemy się do samej zmiennej, a nie gettera — bo jest to zmienna w obrębie klasy
        if(getIloscOsi()*max_masa_os<masa){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
            return;
        }
        System.out.println("Miłej podrozy!");;
    }
}