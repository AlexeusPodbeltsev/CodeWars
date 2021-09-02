import org.junit.Assert;
import org.junit.Test;

public class ZayacTestik {
   @Test
    public void test() {
       Assert.assertEquals("Gde moy keshback ?",
               new TinkoffTests().deleteSpaces("Gde   moy   keshback  ?  "));
    }
}
