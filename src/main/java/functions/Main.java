package functions;

import java.util.function.BiConsumer;

public class Main {


    public static void main(String[] args) {


        twoD.accept(4, 5);

    }

    static BiConsumer<Integer, Integer> twoD = (row, col) -> {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    };




}
