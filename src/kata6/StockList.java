package kata6;


import java.util.Map;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.*;


public class StockList {

    static int stock(String s){
        return Integer.parseInt(s.split(" ")[1]);
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 ||lstOf1stLetter.length==0)return "";

            final Map<String, Integer> counts = stream(lstOfArt)
                    .collect(groupingBy(s -> s.substring(0, 1), summingInt(StockList::stock)));
            return stream(lstOf1stLetter)
                    .map(s -> "(" + s + " : " + counts.getOrDefault(s, 0) + ")")
                    .collect(joining(" - "));
    }
}
