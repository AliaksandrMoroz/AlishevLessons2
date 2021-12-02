package Lesson_009_HashCode_Equals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1,"Mike");
        Person person2 = new Person(1,"Mike");

        map.put(person1,123);
        map.put(person2,321);

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

    }
}
