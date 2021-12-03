package Lesson_012_Comparator;

import java.util.Comparator;

public class BackwardsIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -(o1-o2);
    }
}
