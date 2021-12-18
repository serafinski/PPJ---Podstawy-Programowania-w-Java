public class Nauka {
    public static void main(String[] args) {
        Element head = null;

        {
        Element tmp = new Element(10);

        if(head == null)
            head = tmp;

        else{
            //przypisz next wartość head
            tmp.setNext(head);
            //przypisz head wartość tmp
            head = tmp;
        }
        }
        {
            Element tmp = new Element(20);

            if(head == null)
                head = tmp;
            else{
                tmp.setNext(head);
                head = tmp;
            }
        }
        {
            Element tmp = head;
            while (tmp!=null){
                System.out.println(tmp.data);
                tmp=tmp.next;
            }
        }
    }
}
class Element {
    public Element next;
    public int data;

    // konstruktor
    public Element(int data){
        this.next = null; // wartość null jest wartością "na dzień dobry"
        this.data = data;
    }

    //seter — by nie używać ciągle tmp.next = head a używać tmp.setNext()
    public void setNext(Element next) {
        this.next = next;
    }
}
