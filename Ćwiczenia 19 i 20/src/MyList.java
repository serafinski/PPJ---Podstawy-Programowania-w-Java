public
    class MyList {

    private Element head;

    public void add(Element element){
        if (head != null)
            element.setNext(head);
        head = element;
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
        Element tmp = head;
        while(tmp != null){
            //System.out.println(tmp.getData()); - zamiast używać tego

            //odwołamy się do tmp.getData().show - by rozwiązać problem
            tmp.getData().show();
            tmp = tmp.getNext();
        }
    }

    public void showRe(){
        showRe(head);
    }

    private void showRe(Element element){
        if(element != null) {
            showRe(element.getNext());
            System.out.println(element.getData());
        }
    }
}
