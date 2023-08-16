package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {


        MyNUmber myNUmber=()->
                30.0;

        System.out.println(myNUmber.getValue());
        List<Person> people = List.of(


                new Person("Fila", Male),
                new Person("Lerato", Female),
                new Person("Lwandli", Female),
                new Person("Ronny", Male),
                new Person("Gods", Male)

        );


        System.out.println("//imperative approach");
        System.out.println();
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.gender.equals(Female)) {

                females.add(person);
            }
        }
        for (Person person : females) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("//declarative approach");
        System.out.println();

        List<Person> females2 = people.stream()
                .filter(person -> Female.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        Female, Male
    }
}
