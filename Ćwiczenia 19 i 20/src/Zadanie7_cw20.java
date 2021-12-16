public
    class Zadanie7_cw20 {
    public static void main(String[] args) {

    }
}
class Dzem{
    private String smak;
    private double waga;

    public Dzem(String smak, double waga){
        this.smak = smak;
        this.waga = waga;
    }


    //robimy to w taki sposób, bo ostatnia linijka
    public Dzem(String smak){
        this(smak, 100.0);
    }
    public Dzem(double waga){
        this("No name",waga);
    }
}
