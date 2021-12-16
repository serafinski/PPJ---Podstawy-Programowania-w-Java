public class Program1 {
    public static void main(String[] args) {
        
    }
}
class Student{
    private int sNumber;
    private String name;

    public Student(int sNumber, String name){
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show(){
        System.out.println("Numer: " + sNumber + ", Imię: " + name);
    }
}

// Z WYKORZYSTANIEM TABLICY!
class MyStackArr{
    private Student[] arr;
    private int fill;
    private int wielkosc;

    public MyStackArr(int wielkosc){
        this.arr = new Student[wielkosc]; // na "dzień dobry" 10 elementów w tablicy
        this.fill= 0; // na "dzień dobry" 0 elementów w tablicy
        this.wielkosc= wielkosc;
    }

    public void push(Student student){
        //chcemy by to, co dodajemy na początek stosu, będzie przechowywane w naszej tablicy
        if (fill> wielkosc-1){
            System.out.println("Nie mozna dodac wiecej elementow");
        }
        else
            arr[fill++]=student; // do tego sprowadza się tak naprawdę cała operacja
    }

    public Student pop(){
        return arr[--fill];
    }

    public boolean pusty(){
        return arr == null;
    }
}
// Z WYKORZYSTANIEM TABLICY!





// Z WYKORZYSTANIEM LISTY!

//potrzebne do MyStackList
class ListElement{
    private ListElement next;
    private Student data;

    public ListElement(ListElement next, Student data){
        this.next = next;
        this.data = data;
    }


    //tworzymy get'ery
    public ListElement getNext(){
        return next;
    }

    public Student getData(){
        return data;
    }

    //tworzymy set'ery
    public void setNext(ListElement next){
        this.next = next;
    }

    public void setData(Student data){
        this.data=data;
    }
}
//potrzebne do MyStackList

class MyStackList{
    //tutaj jest gorzej, bo musimy sobie zaimplementować wszystkie elementy

    //implementacja listy, bezpośrednio w obrębie tej klasy
    ListElement head; //wskazuje na pierwszy element — początek łańcucha, od którego będziemy zaczynać



    // na pewno musimy sobie przygotować jakąś informacje, która będzie nam przechowywała kolejnych studentów
    public MyStackList(){
    }

    public void push(Student student){
        //chcemy by to, co dodajemy na początek stosu, będzie przechowywane w naszej tablicy

        // dodawanie nowego studenta

        //ListElement — pełni nam tylko role dodawania czegoś do stosu
        ListElement le = new ListElement();
        le.setData(student); //ustawiamy sobie naszego studenta
        le.setNext(head);
        head = le;
    }

    //pop jest gorszy...

    public Student pop(){
        //...bo musimy pobrać wartość ...
        ListElement le = head; //będziemy chcieli pobrać informacje z head

        //...i wykorzystać później do przypisania do head
        head = le.getNext(); // jak wyjmiemy to head to następny element
        return le.getData(); // wybieramy dane, które są nam potrzebne
    }
}
// Z WYKORZYSTANIEM LISTY!