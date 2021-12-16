public class Program1 {
    public static void main(String[] args) {
        int size = 4;
// jak zrobić to zadanie na minimalnej ilości for'ów?
        for (int i=0; i < size; i++) {
            for (int j = 0; j < size - i; j++)
                System.out.print(".");
            for (int j = -i; j <= i; j++)
                System.out.print("*");
            for (int j = 0; j < size - i; j++)
                System.out.print(".");
            System.out.println();
        }

    }
}
