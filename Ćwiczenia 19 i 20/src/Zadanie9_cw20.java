public class Zadanie9_cw20 {
    public static void main(String[] args) {

    }
}
class Corn{
    private int cornCount;

    public Corn (int cornCount){
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn(){
        //przypisany rozmiar
        Popcorn[] arr = new Popcorn[(int)(Math.random()*cornCount)];
        //przejście po tablicy
        for (int i=0; i< arr.length; i++)
            arr[i]=new Popcorn();
        return arr;
    }
}
//ma domyślny konstruktor
class Popcorn{}
