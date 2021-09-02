import org.junit.*;


public class StockListTest {
    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        Assert.assertEquals("(A : 200) - (B : 1140)",
                kata6.StockList.stockSummary(art, cd));
    }
}
