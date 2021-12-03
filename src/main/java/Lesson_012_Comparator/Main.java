package Lesson_012_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//
//        animals.add("frog");
//        animals.add("dog");
//        animals.add("pig");
//        animals.add("cat");
//        animals.add("bird");
//        animals.add("a");
//
//        Collections.sort(animals, new StringLengthComparator());
//        System.out.println(animals);

//        List<Integer> numbers= new ArrayList<>();
//
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(9);
//        numbers.add(1);
//        numbers.add(7);
//
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -(o1-o2);
//            }
//        });
//        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3,"Alex"));
        people.add(new Person(12,"Hanna"));
        people.add(new Person(1,"Kira"));
        people.add(new Person(14,"Vasya"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()- o2.getId();
            }
        });
        System.out.println(people);

    }
}
