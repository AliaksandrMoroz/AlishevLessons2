package Lesson_008_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
//        testSet(set);
//        testSet(linkedHashSet);
//        testSet(treeSet);
//        System.out.println(set.isEmpty());
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();


    set1.addAll(testSet2(set1));
    set2.addAll(testSet2(set2));
        System.out.println(set1);
        System.out.println(set2);
//        union= объединение
//    Set<Integer> union =new HashSet<>(set1);
//    union.addAll(set2);
//        System.out.println(union);

//        interception= пересечение
    Set<Integer> interception = new HashSet<>(set1);
    interception.retainAll(set2);
        System.out.println(interception);

//        difference= разность
    Set<Integer> difference = new HashSet<>(set1);
    difference.removeAll(set2);
        System.out.println(difference);


    }
    public static void testSet(Set<String> set){
        set.add("Kira");
        set.add("Vasya");
        set.add("Hanna");
        set.add("Alex");
        set.add("Dima");
//        System.out.println(set);
//        System.out.println(set.contains("Andrey"));
//        System.out.println("Alex");

    }


    public static Set<Integer> testSet2(Set<Integer> set){
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        set.add((int)(Math.random()*10));
        return set;
    }

}
