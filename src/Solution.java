public class Solution {


//    public static int digital_root(int n) {
//        int sum = 0;
//        int num = n;
//        while (Integer.toString(num).length() != 1) {
//            for (int i = 0; i < Integer.toString(num).length(); i++) {
//                sum += Integer.parseInt(String.valueOf(Integer.toString(num).charAt(i)));
//            }
//            num = sum;
//            sum = 0;
//        }
//        return num;
//    }
public static int digital_root(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
}
    public static String spinWords(String sentence) {
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > 4) {
                word[i] = new StringBuilder(word[i]).reverse().toString();
            }
        }
        return String.join(" ", word);
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }

}