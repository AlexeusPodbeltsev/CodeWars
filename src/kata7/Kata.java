package kata7;

import java.util.regex.Pattern;

public class Kata {
//    public static boolean solution(String str, String ending) {
//
//        if (!str.contains("\n")&&!ending.contains("\n")) {
//
//        StringBuilder end = new StringBuilder();
//        for (int i = 0; i < ending.length(); i++) {
//            if (!Character.isLetterOrDigit(ending.charAt(i))){
//                end.append("\\").append(ending.charAt(i));
//                continue;
//            }
//
//            end.append(ending.charAt(i));
//
//        }
//        return Pattern.compile(end + "$").matcher(str).find();
//        }
//
//        return false;
//    }
    public static boolean solution(String str,String end){
        return str.endsWith(end);
    }

}
