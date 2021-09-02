public class TinkoffTests {
    public String deleteSpaces(String str){
        String[] array = str.split("\\s+");
        return String.join(" ",array);
    }
}
