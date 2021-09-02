package proghub;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

    public static String reverse(String a) {
        if (!a.isBlank()) {
            // великолепный код тут
            String[] arr = a.split(" ");
            if (arr.length == 2) {
                return arr[1] + " " + arr[0];
            }
            int mid = arr.length / 2;
            for (int i = 0; i < arr.length; i++) {
                if (i == mid) break;
                String temp = arr[i];
                arr[i] = arr[(arr.length - 1) - i];
                arr[(arr.length - 1) - i] = temp;
            }
            return String.join(" ", arr);
        }else return a;
    }

    public static void main(String[] args) {
        System.out.println(reverse(""));
    }

}