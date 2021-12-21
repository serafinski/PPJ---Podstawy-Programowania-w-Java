//Kolejka jest strukturą danych, w której nowe dane dopisywane są na końcu kolejki, a pobierane są z początku kolejki.

//Utwórz własną implementacjęMyQueue, która będzie:
//zawierała metodę void put(...) pozwalającą na dodanie do kolejki elementu;
//zawierała metodę ... get() zwracającą element pobrany z kolejki.


//Utwórz dwie struktury reprezentujące koszyki i naprzemiennie wyciągaj z nich elementy, które zostaną umieszczone w kolejce.
// Gdy koszyki będą już puste, wówczas rozpocznij wyciąganie elementów z kolejki. Wyciągaj sekwencyjnie po dwa elementy i tak powstałą parę wyświetl na ekranie.

//Powtarzaj sekwencję aż do opróżnienia kolejki.

public class Program2 {
    public static void main(String[] args) {

        //kolejka może być jak najbardziej zrealizowana na tablicy — ale byłoby to strasznie pracochłonne
        //z tego powodu — lepiej to zrobić na liście!


        String[] koszykA = {"PSG","Atletico Madryt","Sporting CP","Inter","Benfica","Villarreal","RB Salzburg", "Chelsea"};
        String[] koszykB = {"Manchester City", "Liverpool", "Ajax Amsterdam","Real Madryt", "Bayern Monachium","Manchester United", "Lille","Juventus"};

        MyQueue myQueue = new MyQueue(); // gdzieś musimy umieścić nasze wylosowane drużyny

        //będziemy wyciągać tak długo elementy, aż się skończą
        String g1;
        String g2;

        //tak długo aż są drużyny w koszykach
        while ((g1=getTeam(koszykA)) !=null && (g2=getTeam(koszykB)) != null) {
            myQueue.put(g1);//umieszczaj w kolejce
            myQueue.put(g2);//umieszczaj w kolejce
        }

        //chcemy zwracać pary
        while ((g1= myQueue.get()) !=null && (g2= myQueue.get()) != null) {
            System.out.println(g1 + " - " + g2);
        }

    }
    //chcemy stworzyć funkcje, która będzie pobierać losowy element z koszyka A, jak i B
    public static String getTeam(String[] koszyk){
        int count = 0; //musimy móc jakoś policzyć ile elementów jest w naszych koszykach

        //advanced for — liczymy ile drużyn w koszyku
        for(String druzyna : koszyk)
            if (druzyna != null) //jeżeli drużyna znajduje się w koszyku
                count++; // zwiększaj count

            int select = (int)(Math.random()*count); //losujemy dowolną drużynę z koszyka

            count=0; //zerujemy, by liczyć od początku

            //standardowe przejście po tablicy
            for(int i=0;i<koszyk.length; i++){
                if(koszyk[i] != null){//sprawdzamy, czy pozycja w koszyku nie jest = null
                    if(count==select){ //sprawdzamy, czy wartość count jest taka sama jak select,
                        //wtedy dostajemy info — znalazłem zespół, który został wylosowany przez select
                        String tmp = koszyk[i]; //tymczasowo przechowujemy nasz String

                        koszyk[i] = null; //jak wyciągniemy — to nic tam nie ma

                        return tmp; //który zaraz zostanie zwrócony
                    }
                    count++;//w takim przypadku zwiększamy count
                }
            }
        return null; //może się okazać, że ani razu nie wejdzie do tej pętli — wtedy zwracamy null
    }
}

class MyQueue{

    private Node head; //standardowo inicjujemy head

    //metoda dodająca wartość do naszej kolejki
    public void put(String str){
        Node node = new Node(str); //tworzymy zmienną klasy Node na bazie dostarczonej zmiennej str

        if(head == null)
            head = node;

        //jeżeli head nie jest = null (pusty element)
        //to musimy znaleźć taki element naszej listy — które pole next mówi nam o tym, że jest to element pusty

        //musimy znaleźć ostatni element w naszej liście
        else{
            Node tmp = head; // duplikat head — pozwala na przechodzenie przez całą listę, nie modyfikując przy tym head

            //będziemy szukać takiego elementu tmp — którego wartość getNext nie będzie się = null
            while (tmp.getNext() != null)
                tmp = tmp.getNext(); // szukamy ostatniego elementu

            //jeżeli znajdziemy taki element, to opuszczamy pętle -> tmp jest na pewno OSTATNIM elementem w naszej liście
            tmp.setNext(node); //ustaw pole next ostatniego elementu jako nowe node

            //de facto sytuacja stania w kolejce -> "pan jest ostatni?" -> "o to ja będę z panem stać!"

        }

    }

    //metoda pobierająca wartość z naszej kolejki
    public String get(){
        if(head == null)
            return null; //jeżeli jest pusty to możemy zwrócić tylko pusty ciąg

        //jeżeli nie jest = null
        Node tmp = head; //duplikat tej wartości, którą w tym momencie pokazuje head
        head = tmp.getNext(); // przypisujemy head wartość pokazywaną przez tmp.getNext
        return tmp.getData(); // zwracamy dane które mamy w obrębie naszego ciągu znaków -> jako do naszego miejsca gdzie wywołaliśmy metode
    }
    //przydałoby się jeszcze to pokazać
    public void show(){
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.getData()); //wypisz
            tmp = tmp.getNext(); //przejdź do następnego elementu
        }
    }

}

//klasa opisująca jakie pola mogą być — potrzebne do implementacji listy
class Node{
    private Node next; //podstawowa rzecz
    private String data; //pole danych

    public Node(String data) {
        this.data = data;
    }

    //getter do next
    public Node getNext() {
        return next;
    }

    //getter do danych
    public String getData() {
        return data;
    }

    //setter do next — od czasu do czasu musimy ustawić nasze next na jakąś wartość
    public void setNext(Node next) {
        this.next = next;
    }

}