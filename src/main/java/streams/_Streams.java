package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.*;
public class _Streams {

    public static void main(String[] args) {

        List<Person> people = List.of(


                new Person("Fila", Male),
                new Person("Lerato", Female),
                new Person("Lwandli", Female),
                new Person("Ronny", Male),
                new Person("Gods", Male)

        );

        people.stream()
                .map(person->person.name)
                .mapToInt(String::length)
//                .collect(Collectors.toSet())
                .forEach(System.out::println);


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
