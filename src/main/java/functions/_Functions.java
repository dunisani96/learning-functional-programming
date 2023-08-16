package functions;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functions {

    public static void main(String[] args) {

        int increment=incrementByOne.apply(2);
        System.out.println(increment);

        int result=incrementByOne
                .andThen(multiplyByTen)
                .apply(2);
        System.out.println(result);

        int increAndMulti=biFunction.apply(5,100);
        System.out.println(increAndMulti);

        System.out.println(loops.apply(10));

    }
    static int incrementBy1(int number){
        return number+1;
    }

    static Function<Integer,Integer> incrementByOne=number-> number+1;

    static  Function<Integer,Integer> multiplyByTen=number-> number*10;

    static  Function<Integer, ArrayList<Integer>> loops=number->{
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (int i=0; i<=number; i++) arrayList.add(i);
        return arrayList;
    };




    //bifunction
    static BiFunction<Integer,Integer,Integer> biFunction=(numbertoIncrem,numberToMulti)-> (numbertoIncrem+1)*numberToMulti;






//    static int factorial(int number) {
//        if (number >= 1) {
//            return number * factorial(number - 1);
//        }
//        return 1;
//    }
}
