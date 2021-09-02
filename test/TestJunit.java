import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay aay tringsay !", PigLatin.pigIt("This is a string !"));
    }

    @Test
    public void humanReadableTests() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
    }

    @Test
    public void test1() {
        String[] a = {"tarp", "mice", "bull"};
        String[] b = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = {};
        Assert.assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}
