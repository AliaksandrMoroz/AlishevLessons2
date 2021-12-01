package Lesson_006_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2,"Два");
        map.put(3,"Три");

//        System.out.println(map);
//
//        map.put(3,"Другое");
//
//        System.out.println(map);
//
//        System.out.println(map.get(0));

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
