package book;


import java.util.Scanner;

abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }
    class MyBook extends Book{
        int price;

        MyBook(String title,String author,int price ){
            super(title,author);
            this.price=price;
        }
        void display()
        {
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
    }
    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.close();

            Book book = new MyBook(title, author, price);
            book.display();
        }
    }

 class Pets {

    static public int countPets; private String petname; private String breed; private String classA; private String environment;


    public Pets() {

    }

    public Pets(String petname, String breed, String classA) { countPets++;

        this.petname = petname; this.breed = breed; this.classA = classA; environment = "house";

    }

    public Pets(String petname, String breed, String classA, String environment) {

        this.petname = petname; this.breed = breed; this.classA = classA;

        this.environment = environment;


    }

    public String getInfo() { String msg;

        msg = petname + "is a "+ breed + "and stays in "+ environment; return msg;

    }

    public String petClassInfo() { String msg;

        return msg = petname + "is of class: "+ classA;

    }

}

