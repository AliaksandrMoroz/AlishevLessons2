package Lesson_007_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hashMap= new HashMap<>();
        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        Map<Integer,String> treeMap= new TreeMap<>();
//        testMap(hashMap);
//        testMap(linkedHashMap);
        testMap(treeMap);
    }
    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(32,"Alex");
        map.put(26,"Hanna");
        map.put(2,"Kira");
        map.put(30,"Dima");

        for (Map.Entry<Integer,String> entryMap:
             map.entrySet()) {
            System.out.println(entryMap.getKey()+" : "+entryMap.getValue());
        }
    }
}
