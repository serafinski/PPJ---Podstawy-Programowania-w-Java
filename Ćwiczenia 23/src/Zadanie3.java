public class Zadanie3 {
    public static void main(String[] args) {
        //umieszczamy owoce, aż nie zbierze się 5kg owoców
        Owoc[] owoce = new Owoc[100];

        //musimy wiedzieć ile waży każdy z tych owoców

        //tworzymy drzewo, z którego będziemy zrywać owoce
        DrzewoZad3 drzewo = new DrzewoZad3();

        //tworzymy zmienną odpowiedzialną za liczenie owoców
        int count = 0;

        //tak długo, jak ciężar naszego koszyka owoców jest mniejszy od 5000g
        while (getWeight(owoce)<5000){
            //tak długo do koszyka na pozycje count++ wstawiamy drzewo.zerwijOwoc()
            owoce[count++] = drzewo.zerwijOwoc();
        }
        //wyświetlamy na ekranie ile tak naprawdę tych owoców uzbierało
        System.out.println(getWeight(owoce));
    }
    // tworzymy metodę, by móc ją zastosować w while — powyżej
    private static double getWeight(Owoc[] owoce){
        //zmienna do przechowywania masy
        double res = 0;
        //wyciągamy owoc z tablicy owoców
        for(Owoc owoc : owoce)
            //dodajemy tę klauzulę, bo na dzień dobry owoc był pusty
            if(owoc!=null)
            //pytamy się każdego owocu, jaka jest jego masa i dodajemy do ogólnej masy
                res += owoc.getMasa();

        return res;
    }
}
class Owoc{
    private String nazwa;
    private double masa;

    //nazwa owocu zgodna z nazwą klasy
    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        //losowanie masy owocu z przedziału 100 - 250g
        this.masa = 100+(int)(Math.random()*150);
    }

    public double getMasa() {
        return masa;
    }
}
class Jablko
        extends Owoc{

    public Jablko(String nazwa) {
        super(nazwa);
    }
}
class Pomarancza
        extends Owoc{

    public Pomarancza(String nazwa) {
        super(nazwa);
    }
}
class Gruszka
        extends Owoc{

    public Gruszka(String nazwa) {
        super(nazwa);
    }
}

class DrzewoZad3 {
    public Owoc zerwijOwoc(){
        return switch ((int)(Math.random()*3)){
            case 0 -> new Jablko("jablko");
            case 1 -> new Pomarancza("pomarancza");

            //taki default ustawił dr Tomaszewski
            default -> new Gruszka("Gruszka");
        };
    }
}