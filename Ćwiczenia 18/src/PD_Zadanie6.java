// można mieć tylko 1 klasę publiczną w programie!!!
public class PD_Zadanie6 {
    public static void main(String[] args) {
        // klasa Person, zmienna person — różnica, bo różne wielkości liter
        Person person = new Person();

        // inicjacja literałami
        person.name = "Tomasz";
        person.surname = "Serafiński";
        person.birthyear = 1999;

        person.show(); // metoda show wywołana na zmiennej person
    }
}
// nie można robić klasy w klasie — ale nic nie stoi na przeszkodzie, by zrobić klasę pod / nad klasą publiczną
class Person {

    //pola mogą być publiczne!
    public String name;
    public String surname;
    public int birthyear;

    // metoda — stworzona dodatkowo — nie było w poleceniu
    public void show(){
        System.out.println(name + " "+ surname+ " "+ birthyear);
    }

}