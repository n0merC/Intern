package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Samrat",MALE));
        people.add(new Person("Jeena", FEMALE));
        people.add(new Person("Smriti", FEMALE));
        people.add(new Person("Aayush",MALE));
        people.add(new Person("Karina", FEMALE));
        people.add(new Person("Shristi", FEMALE));

        System.out.println("People-------------");

        people.forEach(System.out::println);

        List<Person> females = new ArrayList<>();

        for(Person person:people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        System.out.println("FEMALES-------------");
        for(Person female:females){
            System.out.println("Name:::"+female.name+"  Gender:::"+female.gender);
        }

//        people.stream().filter(person -> FEMALE.equals(person.gender)).forEach(System.out::println);

    }

    static class Person{
        final String name;
        final Gender gender;

        public String toString(){
            return (name+gender);
        }

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
