package proghub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Even {
    static int[] even(List<Integer> arr) {
        // великолепный код тут
        arr.removeIf(integer -> integer % 2 != 0);
        int[] evenNum = new int[arr.size()];
        for (int i = 0; i < evenNum.length; i++) {
            evenNum[i] = arr.get(i);
        }
        return evenNum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println(Arrays.toString(even(arrayList)));
    }
}
