public
    class Zadanie2 {
    public static void main(String[] args) {
        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false,10,Drzewo.OKRAGLAWY,DrzewoLisciaste.ELIPTYCZNY,"Grusza");
        System.out.println(drzewoOwocowe);
    }
}

class DrzewoIglaste
        extends Drzewo{

    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }
    @Override
    public String toString(){
        return "DrzewoIglaste (" +super.toString()+
                "," + iloscIgiel +
                ", " + dlugoscSzyszki+")";
    }
}
class DrzewoLisciaste
        extends Drzewo{
    int ksztaltLiscia;

    //idziemy po kolejnych potęgach dwójki — bo będziemy mieć opcje pośrednie -> które przypiszemy do wartości pomiędzy — by móc je w dowolny sposób mieszać
    public static final int SZPILKOWY = 1;
    public static final int LANCETOWATY = 2;
    public static final int ELIPTYCZNY = 4;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString(){
        return "Drzewo Liściaste (" + super.toString() +
                ", " + ksztaltLiscia+")";
    }
}
class DrzewoOwocowe
        extends DrzewoLisciaste{
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString(){
        return "Drzewo owocowe (" + super.toString() +
                ", " + nazwaOwoca+")";
    }
}