public class Zadanie5_cw20 {
    public static void main(String[] args) {

    }
}

class KulaW{
    private double r;

    public KulaW(Kwadrat kwadrat){
        this.r = kwadrat.getBok()/2; // promień naszej kuli
    }
    public KulaW(Walec walec){
        // wartość promienia jest uzależniona od naszego walca

        // jeżeli promień (podstawy) walca*2 okaże się większy od wysokości walca
        this.r = (walec.getRadius()*2> walec.getHeight()) ? walec.getHeight()/2 : walec.getRadius();
    }
}
