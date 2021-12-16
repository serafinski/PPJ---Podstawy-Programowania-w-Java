public class Program3 {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println("Przed: "+wrt);
        modifyValue(wrt);
        System.out.println("Po: "+wrt);
    }
    public static void modifyValue(int val){
        //a
        System.out.println("Dostarczona zmienna: "+val);
        //b
        val = val *5;
        //c
        System.out.println("Zmienna po modyfikacji: "+val);
    }
    //zmiana zaszła tylko w obrębie metody modifyValue -> kontynuujemy dalej main'a -> nic się nie zmieniło
}
