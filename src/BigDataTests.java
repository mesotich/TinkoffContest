import org.junit.Assert;
import org.junit.Test;

public class BigDataTests {

    private int[] data;

    @Test
    public void testBigData1() {
        data = new int[1000];
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) data[i] = 1_000_000_000 - 1;
            else data[i] = 1_000_000_000;
        }
        String actual = Main.oddEven(1000, data);
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testBigData2() {
        data = new int[1000];
        for (int i = 0; i < 998; i++) {
            if (i % 2 == 0) data[i] = 1_000_000_000 - 1;
            else data[i] = 1_000_000_000;
        }
        data[998]=1_000_000_000;
        data[999]=1_000_000_000 - 1;
        String actual = Main.oddEven(1000, data);
        Assert.assertEquals("999 1000", actual);
    }
}
