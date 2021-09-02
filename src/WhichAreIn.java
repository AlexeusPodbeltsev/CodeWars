public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        String[] result = new String[array1.length];

        for (int i = 0; i < array1.length; i++) {

            for (String s : array2) {

                if (result[i] != null) break;

                for (int k = 0; k <= (s.length() - array1[i].length()); k++) {

                    if (array1[i].equals(s.substring(k, k + array1[i].length()))) {
                        result[i] = array1[i];
                        break;
                    }
                }
            }
        }
        if (result[1]!=null)return result;
        else return new String[0];
    }
}
