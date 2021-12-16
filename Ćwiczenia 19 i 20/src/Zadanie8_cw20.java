public class Zadanie8_cw20 {
    public static void main(String[] args) {

    }
}
class Sloik{
    private Dzem dzem;
    private boolean stan;

    public Sloik (Dzem dzem){
        otworz();
        this.dzem = dzem;
        zamknij();
    }

    public void otworz(){
        if(!czyOtwarty())
            this.stan = true;
    }

    public void zamknij(){
        if(czyOtwarty())
            this.stan = false;
    }

    public boolean czyOtwarty(){
        return stan;
    }
}