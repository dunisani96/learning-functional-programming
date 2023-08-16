package functions;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDbConnection());
        System.out.println(getDbConnectionSupplier.get());
        System.out.println(getDouble.get());



    }

    static String getDbConnection(){

        return "jdbc//localhost:5432/users";
    }

   static double x=45*3.5;

    static Supplier<String> getDbConnectionSupplier=()->
            "jdbc//localhost:5432/cars";
    static  Supplier<Double> getDouble=()->
           x;


}
