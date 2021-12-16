public class Zadanie6_cw20 {
    public static void main(String[] args) {

    }
}
class KulaNa{
    private double r;

    //wg wzorów
    public KulaNa(Kwadrat kwadrat){
        this.r = Math.sqrt(
                Math.pow((Math.sqrt(2)*kwadrat.getBok())/2,2)+
                Math.pow(kwadrat.getBok()/2,2)
        );
    }


    //ten sam mechanizm co wyżej
    public KulaNa(Walec walec){
        this.r = Math.sqrt(
                Math.pow(walec.getRadius(),2)+
                Math.pow(walec.getHeight()/2,2)
        );

    }
}