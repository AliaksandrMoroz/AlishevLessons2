package Lesson_013_Comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(personSet);

    }
    private static void addElements(Collection collection){
        collection.add(new Person(2,"Alex"));
        collection.add(new Person(1,"Kira"));
        collection.add(new Person(4,"Hanna"));
        collection.add(new Person(3,"Vasya"));
    }
}
