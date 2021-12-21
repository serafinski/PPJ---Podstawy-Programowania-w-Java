public
class Task2101 {
    public static void main(String[] args) {

        String[] names = {"Ola","Ala","Ela","Jan","Kazik","Wiola"};

        MyStackList myStackList = new MyStackList();

        //10x losujemy jakąś liczbę -> 10x losujemy jakąś osobę z listy
        for(int i=0;i<10;i++){
            int select = (int)(Math.random()* names.length);

            //25000 - będziemy losować nr studenta od 0 do 25000
            Student student =new Student((int)(Math.random()*25000),names[select]);

            //pokazujemy jakich studentów wylosowaliśmy
            student.show();

            //za pomocą push — umieszczamy go w naszej kolejce
            myStackList.push(student);
        }
        System.out.println("///////////////////////////////////////////////////////////");

        Student student;
        //wyciągaj tak długo elementy z kolejki — aż wyświetlisz wszystkie
        while ((student = myStackList.pop())!= null)
            student.show();


    }
}

class Student{
    private int sNumber;
    private String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show(){
        System.out.println(name+" "+ sNumber);
    }

}
// Z WYKORZYSTANIEM TABLICY!
class MyStackArr {

    private Student[] arr;
    private int fill;

    public MyStackArr(){
        arr = new Student[10];
        fill = 0;
    }

    public void push(Student student){
        arr[fill++] = student;
    }

    public Student pop(){
        return arr[--fill];
    }
}
// Z WYKORZYSTANIEM TABLICY!



// Z WYKORZYSTANIEM LISTY!

//potrzebne do MyStackList
class ListElement{
    private ListElement next;
    private Student data;


    //tworzymy get'ery
    public ListElement getNext() {
        return next;
    }


    //tworzymy set'ery
    public void setNext(ListElement next) {
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }
}
//potrzebne do MyStackList

class MyStackList{
    //tutaj jest gorzej, bo musimy sobie zaimplementować wszystkie elementy

    //implementacja listy, bezpośrednio w obrębie tej klasy
    ListElement head; //wskazuje na pierwszy element — początek łańcucha, od którego będziemy zaczynać

    // na pewno musimy sobie przygotować jakąś informacje, która będzie nam przechowywała kolejnych studentów
    public MyStackList() {
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
        //dodatnie tego rozwiązuje problem wyjścia poza zakres
        if(head == null)
            return null;
        //dodatnie tego rozwiązuje problem wyjścia poza zakres

        //...bo musimy pobrać wartość ...
        ListElement le = head;

        //...i wykorzystać później do przypisania do head
        head = le.getNext();// jak wyjmiemy to head to następny element
        return le.getData();// wybieramy dane, które są nam potrzebne
    }
}
// Z WYKORZYSTANIEM LISTY!