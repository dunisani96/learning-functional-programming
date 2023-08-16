package functions;

import java.util.Date;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneValid("0763556656"));
        System.out.println(isPhoneValid("0768556656"));

//        predicate

        boolean valid=isValidPredicate.and(contains3).test("0763556656");
        System.out.println(valid);
        System.out.println(isValidPredicate.test("0763556656"));
        System.out.println(isGreaterThan.test(13));
    }
    static boolean isPhoneValid(String phone){

        if(phone.startsWith("076") && phone.contains("3") && phone.length()==10){

            return true;
        }
        return false;
    }
    static Predicate<String> isValidPredicate=phoneNumber->
            phoneNumber.startsWith("076") && phoneNumber.length()==10;
    static Predicate<String> contains3=phoneNumber->phoneNumber.contains("3");

    static Predicate<Integer> isGreaterThan=number->
            number<=100 && number%2==0;
}
