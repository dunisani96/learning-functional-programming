package functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
         Customer dunisani= new Customer("Dunisani", "88888");
         Customer test= new Customer("Test", "88888");
//        greeting(dunisani,false);
//        greeting(test,true);

//        greetingConsumer.accept(dunisani);
        greetingCustomerv2.andThen(_Consumer::greeting).accept(dunisani,true);

//        greetingCustomerv2.accept(dunisani,false);

        String s= new String("abc");

      int speed =40;

      boolean isSpeeding=(speed>60)? true:false;
      String result=(isSpeeding==false)? "No speeding fine":"speeding fine";


    }

    static void greeting(Customer customer,boolean showPhoneNUmber){

        System.out.println("Hello "+customer.getName()+" of phone number "+(showPhoneNUmber?customer.phoneNumber:"******"));
    }

    static Consumer<Customer> greetingConsumer=customer ->
            System.out.println("Hello "+customer.getName()+" of phone number "+customer.getPhoneNumber());

    static BiConsumer<Customer,Boolean> greetingCustomerv2=(customer,showPhoneNumber)->
            System.out.println("Hello "+customer.getName()+" of phone number "+(showPhoneNumber?customer.phoneNumber:"******"));


    static class Customer{
        private final String name;
        private final  String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}
