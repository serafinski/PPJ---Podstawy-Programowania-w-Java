public class Main {
    public static void main(String[] args){

        //zad1
        Student michal = new Student(24643, "Michal");
        Student piotrek = new Student(32321, "Piotr");

        MyStack stos1 = new MyStack(3); //deklarujemy nasz stos z jego wielkoscia

        stos1.push(michal);
        stos1.push(piotrek);

        while(!stos1.empty()){
            stos1.pop().show(); //Wyrzucamy po kolei studentow i wypisujemy ich metode show
        }                       //Jak wyrzucimy juz studentow to nie będzie ich dalej w naszym stosie

        //zad1 cz.2
        MyStackArr stos2 = new MyStackArr(3);
        stos2.push(michal);
        stos2.push(piotrek);

        while(!stos2.empty()){
            stos2.pop().show();
        }
    }
}

class Student {
    int sNumber;
    String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show() {
        System.out.println("Numer studenta: " + sNumber + "jego imie: " + name);
    }
}

//ListElement
class Node {
    Student data;
    Node next;

    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Student data) {
        this(data,null);
    }

    Student getData(){
        return data;
    }

    Node getNext(){
        return next;
    }
}
//ListElement

class MyList {
    private Node head;

    public MyList() {
        head = null;
    }

    public void addFront(Student data) {
        head = new Node(data,head);
    }

    public void addBack(Student data){
        if (head == null) {
            addFront(data);
            return;
        }
        Node tmp = head;

        while(tmp.next != null)
            tmp = tmp.next;

        tmp.next = new Node(data);
    }


    public void showList() {
        System.out.print("[ ");
    }
}

class MyStack {
    private Node head = null;
    private int licznik1 = 0;
    private int sizeOfStack;

    public MyStack(int sizeOfStack){
        this.sizeOfStack = sizeOfStack;
    }

    public void push(Student data){
        if(licznik1++ > sizeOfStack)
            System.out.println("Nie możesz dodac wiecej elementow - MyStackArr");
        else
            head = new Node(data, head);
    }

    public Student pop(){
        Student d = head.getData();
        head = head.getNext();
        return  d;
    }

    public boolean empty(){
        return head == null;
    }
}