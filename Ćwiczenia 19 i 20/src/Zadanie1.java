public class Zadanie1 {
    public static void main(String[] args) {
        Donkey donkey = new Donkey(120); // nasz osioł waży 120 kg

        while (!donkey.isFlying()){ // tak długo, jak osioł nie lata
            donkey.addBalloon(new Balloon()); // dodajemy balonik, a balonik trzeba utworzyć — stąd wartość new Balloon();
        }

    }
}

class Balloon {
    //pole — hel musi się gdzieś przechować
    private double helium;

    // domyślny konstruktor
    public Balloon(){
        // losowa objętość między 0,005 a 0,009 m3
        this.helium= 0.005 + (Math.random()*0.004);
    }

    // metoda wyliczająca udźwig balonu na podstawie założonych danych
    public double getLoad(){
        /*
        Proporcja

        0.007 - 6g (0.006 g)
        helium - ?
         */
        return (helium*0.006)/0.007;

    }

}

class Donkey{
    private double mass; // wyrażona w [kg]
    private Balloon[] balloons; // jednowymiarowa tablica balonów
    private int count; // powie nam ile mamy balonów

    public Donkey(double mass){
        this.mass = mass; //masa dostarczona jako parametr
        balloons = new Balloon[10]; // 10 - zakładamy na "dzień dobry"
        count = 0;
    }

    // metoda dodająca balony
    public void addBalloon(Balloon balloon){ // przyjmuje zmienną balloon, klasy Balloon
        if (count >= balloons.length){ // jeżeli ilość balonów jest większa od długości tablicy balloons

            // tworzymy nową tablicę balonów, która będzie miała 2x większy rozmiar od tej tablicy co była do tej pory
            Balloon[] tmp = new Balloon[balloons.length*2];

            for(int i =0; i< balloons.length; i++)
                tmp[i]=balloons[i]; // przepisujemy balony do tablicy tmp z tablicy balloons - na takie same indeksy
            balloons = tmp; // dostajemy większą tablicę
            System.out.println("Balloons resize: "+ balloons.length);
        }
        // jak liczba balonów nie jest większa — to trzeba ją dodać
        balloons[count++] = balloon; //do balonów na pozycji count dodamy nowy balonik — balloon
    }


    // czy osioł lata -> wartość true / false
    public boolean isFlying(){
        double currentLift = 0.0; // aktualny udźwig
        for(int i=0; i<count; i++)
            currentLift+= balloons[i].getLoad(); // balloons[i] - musi nam dać ile jest w stanie uciągnąć
        if (mass <= currentLift) // jeżeli masa osła jest mniejsza od udźwigu wypisz
            System.out.println("Ja latam!");
        return mass <= currentLift; // jeżeli masa osła jest mniejsza od udźwigu — zwraca true
    }

}