package Lesson_002_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(99));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer el:
             list) {
            System.out.println(el);
        }
            list.remove(5);
        System.out.println(list);

        list=new LinkedList<>(list);

        System.out.println(list);
    }
}
