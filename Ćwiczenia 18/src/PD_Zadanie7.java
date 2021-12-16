public class PD_Zadanie7 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Figa"); // new Fruit -> tworzy nam obiekt klasy!
        fruit.show();
    }
}

class Fruit{
    // pola prywatne
    private String name;
    private double weight;

    //konstruktor

    // należy nazywać parametry konstruktorów dokładanie tak samo, jak pola, które będą inicjowane
    public Fruit(String name){     // nazwa owocu dostarczona do konstruktora klasy
        this.name = name; // musimy użyć this — bo występuje słowo name — występujące w przestrzeni klasy, jak i w nagłówku metody Fruit
        weight = 0.5+(Math.random()*0.3); // losowana wartość z przedziału 0,5 - 0,8 - występuje tylko w przestrzeni klasy
    }

    //metoda show — wyświetlać informacje o nazwie i wadze owoców
    public void show(){
        System.out.println("name:\t\t" + name + "\nweight:\t\t"+weight);
    }
}