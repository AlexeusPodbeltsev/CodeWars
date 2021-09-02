package proghub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Unique {
    static int[] unique(List<Integer> arr) {
        arr = arr.stream().distinct().collect(Collectors.toList());
        int[] uniqueNum = new int[arr.size()];
        for (int i = 0; i < uniqueNum.length; i++) {
            uniqueNum[i] = arr.get(i);

        }
        return uniqueNum;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 2, 6, 8, 3, 1, 5, 8, 5);
        ArrayList<Integer> num = new ArrayList<>(list);
        System.out.println(Arrays.toString(unique(num)));

    }
}
