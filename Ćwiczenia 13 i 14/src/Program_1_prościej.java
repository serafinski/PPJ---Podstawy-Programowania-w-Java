public class Program_1_prościej {
    public static void main(String[] args) {
        int size = 10;
            for (int i=0; i < 2*size+1; i++){
                for (int j = 0; j< 2*size+1; j++){
                    System.out.print(
                            (
                                    (i <= size && j >= size - i &&
                                            j <= size +i) ||
                                    (i> size && j >= 0 + ((i+1)% (size+1)) &&
                                            j < (2*size+1)-((i+1)%(size+1)))
                            )? "*" : "."
                    );
                }
                System.out.println();
            }
        }

    }

