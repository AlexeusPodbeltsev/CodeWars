public class PigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1)
                words[i] = words[i].substring(1) +
                        words[i].charAt(0) + "ay";
            else {
                if (words[i].matches("\\w"))words[i]=words[i] + "ay";
            }
        }
        return String.join(" ", words);
    }

}
