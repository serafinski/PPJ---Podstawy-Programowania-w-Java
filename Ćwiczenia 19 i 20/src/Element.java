public
    class Element {

    private Element next;
    private Word data; // to był wcześniej int — teraz jest Word, przez specyfikę zadania

    public Element(Word data){ //to był wcześniej int — teraz jest Word, przez specyfikę zadania
        this.data = data;
        this.next = null;
    }

    public void setNext(Element next){
        this.next = next;
    }

    public Word getData(){ //to był wcześniej int — teraz jest Word, przez specyfikę zadania
        return data;
    }

    public Element getNext(){
        return next;
    }
}
