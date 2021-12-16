public class Zadanie3 {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();
    }
}

class Kwadrat {
    private double bok;

    public Kwadrat(double bok){
        this.bok = bok;
    }

    public double getBok(){
        return bok;
    }


    public void show(){
        double area = bok*bok;
        double volume = bok*bok*bok;
        System.out.println("Powierzchnia to: " + area +" cm2");
        System.out.println("Objętość to: " + volume + " cm3");
    }
}