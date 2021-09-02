import kata7.Kata;
import org.junit.Assert;
import org.junit.Test;

public class StringEndingTest {
    @Test
    public void endingTest(){
        Assert.assertTrue(Kata.solution("abc", "c"));
        Assert.assertTrue(Kata.solution("Aleksei", "ksei"));
        Assert.assertTrue(Kata.solution("1789", "89"));
        Assert.assertFalse(Kata.solution("abc\n","abc"));
        Assert.assertTrue(Kata.solution("sha(","a("));

    }
}
