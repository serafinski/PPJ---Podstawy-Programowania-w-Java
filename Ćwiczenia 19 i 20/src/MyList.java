public
    class MyList {

    private Element head;

    //metoda mająca za zadanie dodawać elementy
    public void add(Element element){
        if (head != null)
            element.setNext(head); //jeżeli head nie jest = null -> to następny element = head
        head = element; //jeżeli head jest równe null -> to head = element
    }

    public void addEnd(Element element){
        if(head == null){
            head = element;
        } else {
            Element tmp = head;
            while(tmp.getNext() != null)
                tmp = tmp.getNext();
            tmp.setNext(element);
        }
    }

    //METODA SORTED WYRZUCONA BO INTERESUJE NAS SAMO DODAWANIE!

/*
    public void insertSorted(Element element){
        Element tmp = head;
        while(tmp.getNext() != null && tmp.getNext().getData() > element.getData())
            tmp = tmp.getNext();
        if(tmp.getNext() == null)
            tmp.setNext(element);
        else {
            element.setNext(tmp.getNext());
            tmp.setNext(element);
        }
        System.out.println("found: "+tmp.getData());
    }
*/


    // show ma za zadanie wyświetlić wszystkie tmp.getData
    public void show(){
        Element tmp = head; //nadajemy zmiennej typu Element wartość head
        while(tmp != null){ //kiedy tmp nie jest = null
            //System.out.println(tmp.getData()); - zamiast używać tego

            //odwołamy się do tmp.getData().show - by rozwiązać problem
            tmp.getData().show(); //dostajemy Data i pokazujemy je za pomocą metody show z Zadanie11_cw20
            tmp = tmp.getNext(); //przypisujemy tmp następny element
        }
    }

    public void showRe(){
        showRe(head);
    }

    private void showRe(Element element){
        //jeżeli element nie jest = null
        if(element != null) {
            //REKURENCJA
            showRe(element.getNext()); //bierzemy następny element
            System.out.println(element.getData()); //wypisujemy informacje na temat elementu
        }
    }
}
