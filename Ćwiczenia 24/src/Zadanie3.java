public class Zadanie3 {
    public static void main(String[] args) {
        Rakieta rakieta = new Rakieta("Apollo XV");
        rakieta.zatankuj();

        //Podnieś ew. wyjątek dla startu
        try {
            rakieta.start();
        }

        // przechwyć informacje, jeżeli byłoby za mało paliwa
        catch (ZaMaloPaliwaException e){
            e.printStackTrace();
        }
    }
}
class Rakieta{
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa) {
        this.nazwa = nazwa;
        wagaPaliwa = 0;
    }

    public void zatankuj(){
        wagaPaliwa = (int)(Math.random()*1500);
        System.out.println("Zatankowano: "+wagaPaliwa);
    }

    //obsłuż przypadek wyjątku
    public void start() throws ZaMaloPaliwaException{
        // jeżeli waga<1000 - anuluj start!
        if(wagaPaliwa<1000)
            throw new ZaMaloPaliwaException();
        else{
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
            System.out.println("Liftoff!");
        }
    }
}
