public class Zadanie1 {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(5,10);
        prostokat.showPP();

        System.out.println();

        //Prostopadloscian prostopadloscian = new Prostopadloscian(prostokat,15);
        Prostopadloscian prostopadloscian = new Prostopadloscian(5,10,15);
        prostopadloscian.pokazPP();
        prostopadloscian.showObj();

        System.out.println();

        Trojkat trojkat = new Trojkat(3);
        trojkat.showPP();

        System.out.println();

        //Ostroslup ostroslup = new Ostroslup(trojkat,6);
        Ostroslup ostroslup = new Ostroslup(3,6);
        ostroslup.showPP();
        ostroslup.showObj();

        System.out.println();

        //Graniastoslup graniastoslup = new Graniastoslup(trojkat,6);
        Graniastoslup graniastoslup = new Graniastoslup(3,6);
        graniastoslup.showPP();
        graniastoslup.showObj();
    }
}
class Prostokat{
    private double bok_a;
    private double bok_b;

    public Prostokat(double bok_a, double bok_b){
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }

    public double getBok_a() {
        return bok_a;
    }

    public double getBok_b() {
        return bok_b;
    }

    public double getPP(){
        return bok_a*bok_b;
    }

    public void showPP(){
        System.out.println("Pole powierzchni prostokata: "+ getPP());
    }
}

class Prostopadloscian
        extends Prostokat{
    private double wysokosc;

    public Prostopadloscian(double bok_a, double bok_b,double wysokosc) {
        super(bok_a, bok_b);
        this.wysokosc = wysokosc;
    }

    //konstruktory inicjowały wartości pól zarówno na podstawie dostarczonych wartości liczbowych,
    // jak i obiektu klasy bazowej -> możemy zrobić to, co jest poniżej tylko dlatego, że było tak w poleceniu — normalnie jest to błąd!!!
    public Prostopadloscian(Prostokat prostokat, double wysokosc){
        //druga opcja - konstruktor z 2 parametrami

        //this(prostokat.getBok_a(), prostokat.getBok_b(),wysokosc);

        super(prostokat.getBok_a(), prostokat.getBok_b());
        this.wysokosc=wysokosc;
    }

    public void pokazPP(){
        System.out.println("Pole powierzchni prostopadloscianu: " + (
                2* getPP() + 2 * (getBok_a()*wysokosc)+ 2* (getBok_b()*wysokosc))
        );
    }

    public void showObj(){
        System.out.println("Objetosc prostopadloscianu: "+
                (getPP()* wysokosc)
        );
    }
}

class Trojkat{
    private double bok;

    public Trojkat(double bok){
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public double getPP(){
        return ((bok*bok)*Math.sqrt(3))/4;
    }

    public void showPP(){
        System.out.println("Pole powierzchni trojkata: " + getPP());
    }
}

class Ostroslup
        extends Trojkat{

    private double wysokosc;

    public Ostroslup(double bok,double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    //konstruktory inicjowały wartości pól zarówno na podstawie dostarczonych wartości liczbowych,
    // jak i obiektu klasy bazowej -> możemy zrobić to, co jest poniżej tylko dlatego, że było tak w poleceniu — normalnie jest to błąd!!!
    public Ostroslup(Trojkat trojkat, double wysokosc){
        super(trojkat.getBok());
        this.wysokosc=wysokosc;
    }

    // ten znacznik daje nam tylko informacje, że metoda o takiej nazwie została gdzieś wcześniej zdefiniowana w hierarchii
    public void showPP(){
        // na podstawie rysunku — patrz notatki spotkania Teams
        double szaryOdc = ((getBok()*Math.sqrt(3)/2)/3);
        double H = Math.sqrt(szaryOdc*szaryOdc)+(wysokosc*wysokosc);
        System.out.println("Pole powierzchni ostroslupa: " +(
                getPP()+ 3 * ((getBok()*H)/2))
        );
    }
    public void showObj(){
        System.out.println("Objetosc ostroslupa " +
                (getPP()/3)*wysokosc);
    }
}

class Graniastoslup
        extends Trojkat{

    private double wysokosc;

    public Graniastoslup(double bok, double wysokosc) {
        super(bok);
        this.wysokosc = wysokosc;
    }

    //konstruktory inicjowały wartości pól zarówno na podstawie dostarczonych wartości liczbowych,
    // jak i obiektu klasy bazowej -> możemy zrobić to, co jest poniżej tylko dlatego, że było tak w poleceniu — normalnie jest to błąd!!!
    public Graniastoslup(Trojkat trojkat, double wysokosc){
        super(trojkat.getBok());
        this.wysokosc = wysokosc;
    }

    public void showPP(){
        double boczna = 3*(getBok() * wysokosc);
        System.out.println("Pole powierzchni graniastoslupa: "+(
                2*getPP()+boczna));
    }
    public void showObj(){
        System.out.println("Objetosc graniastoslupa: "+(
                getPP()*wysokosc));
    }
}