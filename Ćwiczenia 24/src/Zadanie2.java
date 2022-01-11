public class Zadanie2 {
    public static void main(String[] args) {
        //tworzymy nowy obiekt klasy DetektorDymu
        DetektorDymu detektor = new DetektorDymu();

        //potencjalnie podnieś wyjątek dla sprawdź
        try{
            detektor.sprawdz();
        }
        // przechwyć ewentualny Alarm
        catch (Alarm e){
            //wyświetl ALARM
            e.printStackTrace();
        }
    }
}

class DetektorDymu {
    //metoda sprawdź przekazuje Alarm do obsługi
    public void sprawdz() throws Alarm{

        //blok pozwalający mi zobaczyć jaka wartość jest losowana
        double val = Math.random();
        System.out.println(val);

        //jeżeli wylosowana wartość będzie poniżej 0,2
        if(val<0.2){
            // podnieś Alarm!
            throw new Alarm();
        }
    }
}