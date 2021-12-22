public class Zadanie1 {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo(true,5,Drzewo.PARASOLOWATY);
        System.out.println(drzewo);
    }
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
}