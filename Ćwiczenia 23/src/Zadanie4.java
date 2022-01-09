public class Zadanie4 {
    public static void main(String[] args) {
        Osoba [] kontakty = {new Osoba("Jan","Kowalski","123-456-789"),
                new Osoba("Tomasz","Serafiński","300-051-999"),
                new Osoba("Amelia","Krokosz","999-999-999"),
                new Osoba("Igor","Krawczyk","777-777-777"),
                new Osoba("Jakub","Jarzabek","111-111-111")};
        /*
        Smartfon smartfon = new Smartfon("Samsung","Czarny", kontakty);
        smartfon.zadzwon("123-456-789");
        smartfon.zadzwon("502-811-202");
        smartfon.zadzwon("300-051-999");
        System.out.println();
        smartfon.wyswietlHistoriePolaczen();
         */
        Telefon telefon = new Telefon("Bell Inc.","Biały");
        Komorka komorka = new Komorka("Nokia","Niebieska");
        Smartfon smartfon = new Smartfon("Samsung","Czarny",kontakty);


        Telefon[] telefony = {telefon,komorka,smartfon};

        for(int i=0; i<telefony.length;i++){
            for(int j = 1;j<=10;j++){
                if(j%2 == 0)
                    telefony[i].zadzwon(kontakty[(int)(Math.random()* kontakty.length)].numer);
                else
                    telefony[i].zadzwon(Integer.toString((int)(Math.random()*999999999)));
            }
            System.out.println("Następny");
        }

        for(int i=0;i<telefony.length;i++){
            telefony[i].wyswietlHistoriePolaczen();
        }

        /*
        System.out.println("Telefon");
        for(int i = 1; i<=10;i++)
            if(i % 2 == 0)
                telefon.zadzwon(kontakty[(int)(Math.random()* kontakty.length)].numer);
            else
            telefon.zadzwon(Integer.toString((int)(Math.random()*999999999)));
        System.out.println();

        System.out.println("Komorka");
        for(int i = 1; i<=10;i++)
            if(i % 2 == 0)
                komorka.zadzwon(kontakty[(int)(Math.random()* kontakty.length)].numer);
            else
                komorka.zadzwon(Integer.toString((int)(Math.random()*999999999)));
        System.out.println();

        System.out.println("Smartfon");
        for(int i = 1; i<=10;i++)
            if(i % 2 == 0)
                smartfon.zadzwon(kontakty[(int)(Math.random()* kontakty.length)].numer);
            else
                smartfon.zadzwon(Integer.toString((int)(Math.random()*999999999)));
        System.out.println();

        System.out.println("///////////////////////////////////////////////////////////");



        System.out.println("telefon");
        telefon.wyswietlHistoriePolaczen();
        System.out.println("komorka");
        komorka.wyswietlHistoriePolaczen();
        System.out.println("smartfon");
        smartfon.wyswietlHistoriePolaczen();
         */

    }
}
class Osoba{
    protected String imie;
    protected String nazwisko;
    protected String numer;

    public Osoba (String imie, String nazwisko, String numer){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }
}

class Telefon {
    protected String interfejsKomunikacyjny;
    protected String color;

    public Telefon(String interfejsKomunikacyjny, String color){
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }
    public void zadzwon (String numer){
        System.out.println("Dzwonisz na numer: "+ numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}

class Komorka
        extends Telefon{
    protected  String [] ostatnie = new String[10];
    protected int counter; // który nr połączenia z 10 numerowej historii


    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    //przeciążenie metody z Telefon
    public void zadzwon(String number){
        System.out.println("Dzwonisz do: " + number+"!");

        // licznik, bo musimy dodać ostatnie 10 połączeń
        if(counter == ostatnie.length)
            //jeżeli będzie 10 połączeń wpisanych to nadpisz pierwsze wykonane połączenie
            counter = 0;
        else{
            //wpisz do historii
            ostatnie[counter] = number;
            //zwiększ liczbe wykonanych połączeń
            counter++;
        }
    }

    public void wyswietlHistoriePolaczen(){
        for(String polaczenie:ostatnie){
            System.out.println(polaczenie);
        }
        System.out.println();
    }
}

class Smartfon
        extends Komorka{
    protected Osoba[] znajomi;

    public Smartfon (String interfejsKomunikacyjny, String color, Osoba[] znajomi){
        super(interfejsKomunikacyjny,color);
        this.znajomi = znajomi;
    }

    public void wyswietlHistoriePolaczen(){
        for(int i = 0; i<ostatnie.length; i++) {

            //blok wyświetlający same numery znajomych
            boolean samNumer = true;
            for (int j = 0; j < znajomi.length; j++)
                if (ostatnie[i] == znajomi[j].numer) {
                    System.out.println(znajomi[j].imie + " " + znajomi[j].nazwisko + " " + znajomi[j].numer);
                    samNumer = false; //Nie zostanie wywołane, jeżeli nie będzie nr. znajomego — przejdziemy do dalszego if
                }

            //Wywołane w przypadku, jeżeli nie jest to nr. znajomego
            if (samNumer)
                System.out.println(ostatnie[i]);
        }
    }
}