public class Zadanie3 {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd("czerwony");

        PojazdKolowy pojazdKolowy = new PojazdKolowy(pojazd,2);

        CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy(pojazdKolowy,15000);

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

    public PojazdKolowy(Pojazd pojazd, int iloscOsi){
        super(pojazd.getColor());
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }
}

class CiagnikSiodlowy
        extends PojazdKolowy{
    private double masa;


    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public CiagnikSiodlowy(PojazdKolowy pojazdKolowy, double masa){
        super(pojazdKolowy.getColor(),pojazdKolowy.getIloscOsi());
        this.masa = masa;
    }

    public double getMasa() {
        return masa;
    }

    public void rozpocznijJazde(){
        double max_masa_os = 11000;
        if(getIloscOsi()*max_masa_os<getMasa())
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        else
            System.out.println("Miłej podrozy!");;
    }
}