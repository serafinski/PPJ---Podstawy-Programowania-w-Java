public
    class Element {

    private Element next;
    private Word data; // to był wcześniej int — teraz jest Word, przez specyfikę zadania

    //konstruktor
    public Element(Word data){ //to był wcześniej int — teraz jest Word, przez specyfikę zadania
        this.data = data;
        this.next = null; //next jest z automatu inicjowane wartością null
    }

    //setter — ustawia wartość następnego elementu
    public void setNext(Element next){
        this.next = next;
    }

    //getter zwracający data
    public Word getData(){ //to był wcześniej int — teraz jest Word, przez specyfikę zadania
        return data;
    }

    //getter zwracający next
    public Element getNext(){
        return next;
    }
}
