public class Zadanie4 {
    public static void main(String[] args) {
        Walec walec = new Walec(10,5);
        walec.show();

    }
}
class Walec{
    private double radius;
    private double height;

    public Walec(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void show(){
        double podstawa = Math.PI * (radius*radius);
        double volume = podstawa*height;
        System.out.println("Pole powierzchni podstawy to: "+ String.format("%.2f",podstawa) + " cm2");
        System.out.println("Objętość walca to: "+ String.format("%.2f",volume)+ " cm3");
    }
}
