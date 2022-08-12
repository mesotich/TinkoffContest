import org.junit.Assert;
import org.junit.Test;

public class SimpleTests {

    @Test
    public void testSimple1() {
        int actual = Main.minFlight(new int[]{5, 5}, new int[]{1, 4, 9, 16, 25}, 2);
        Assert.assertEquals(24, actual);
    }

    @Test
    public void testSimple2() {
        int actual = Main.minFlight(new int[]{6, 4}, new int[]{1, 2, 3, 6, 8, 25}, 5);
        Assert.assertEquals(31, actual);
    }
    @Test
    public void testSimple3() {
        int actual = Main.minFlight(new int[]{2, 2}, new int[]{5, 8}, 2);
        Assert.assertEquals(3, actual);
    }
    @Test
    public void testSimple4() {
        int actual = Main.minFlight(new int[]{2, 10}, new int[]{5, 8}, 2);
        Assert.assertEquals(3, actual);
    }
}
