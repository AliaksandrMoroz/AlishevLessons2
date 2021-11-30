package Lesson_004_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);

        System.out.println(measureTime(arrayList));
    }

    private static List<Integer> measureTime(List<Integer> list) {
            for (int i = 0; i < 10; i++) {
            list.add(i);
             }
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i <100_000; i++) {
//            list.add(0,i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
        return list;
    }

}
