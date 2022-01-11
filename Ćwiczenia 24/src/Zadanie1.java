public class Zadanie1 {
    public static void main(String[] args) {

        DrzewoIglaste sosna = new DrzewoIglaste(true,2,Drzewo.STOZKOWY,20,5);
        DrzewoIglaste modrzew = new DrzewoIglaste(true,4,Drzewo.OKRAGLAWY,10,3);
        DrzewoLisciaste dab = new DrzewoLisciaste(false,5,Drzewo.KOLUMNOWY,DrzewoLisciaste.ELIPTYCZNY);
        DrzewoOwocowe morela = new DrzewoOwocowe(false,1,Drzewo.STOZKOWY,DrzewoLisciaste.LANCETOWATY,"Morela");
        DrzewoOwocowe sliwa = new DrzewoOwocowe(false,1,Drzewo.PARASOLOWATY,DrzewoLisciaste.SZPILKOWY,"Śliwka");

        Drzewo[] las = {sosna,modrzew,dab,morela,sliwa};


        /// !!!TO ZOSTAŁO DODANE!!! ///

        for(Drzewo drzewo : las)
            //potencjalnie podnieś wyjątek
            try{
                //spróbuj wykonać zerwijOwoc()
                drzewo.zerwijOwoc();
                //jeżeli się uda wypisz
                System.out.println("Mniam!");
            }
            //przechwyć wyjątek
            catch (DrzewoBezOwocowException e){
                //wypisz błąd
                e.printStackTrace();
            }
        }

        /// !!!TO ZOSTAŁO DODANE!!! ///

    }


class Drzewo{

    //te zmienne mogą posłużyć jako listy, którymi możemy wypełnić parametry naszego konstruktora

    //te przekroje są cały czas takie same
    public static final String STOZKOWY = "stozkowy";
    public static final String KOLUMNOWY = "kolumnowy";
    public static final String OKRAGLAWY = "okraglawy";
    public static final String PARASOLOWATY = "parasolowaty";

    //przy dziedziczeniu — większość zmiennych powinna być albo prywatna, albo chroniona
    //tak byśmy spoza pakietu / klasy nie mogli się do nich bezpośrednio odwołać ->
    // ale by klasy, które po nich bezpośrednio dziedziczą — MOGŁY!

    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }
    //przedefiniowanie metody toString
    @Override
    public String toString(){
        return "Drzewo (" + wiecznieZielone + ", " + wysokosc + ", "+ przekrojDrzewa+")";
    }


    /// !!!TO ZOSTAŁO DODANE!!! ///

    //throws — przekazuje wyjątek do obsługi
    public void zerwijOwoc() throws DrzewoBezOwocowException{

        //podnieś wyjątek!
        throw new DrzewoBezOwocowException();
    }
    /// !!!TO ZOSTAŁO DODANE!!! ///


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




    /// !!!TO ZOSTAŁO DODANE!!! ///

    //w przypadku drzewa owocowego chcemy, aby zwrócił nam nazwę owocu!
    @Override
    public void zerwijOwoc(){
        System.out.println(nazwaOwoca);
    }

    /// !!!TO ZOSTAŁO DODANE!!! ///

}