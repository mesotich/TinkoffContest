import org.junit.Assert;
import org.junit.Test;

public class SimpleTests {

    @Test
    public void testSimple1() {
        long actual = Main.maxSum(new int[]{5, 2}, new int[]{1, 2, 1, 3, 5});
        Assert.assertEquals(16, actual);
    }

    @Test
    public void testSimple2() {
        long actual = Main.maxSum(new int[]{3, 1}, new int[]{99, 5, 85});
        Assert.assertEquals(10, actual);
    }

    @Test
    public void testSimple3() {
        long actual = Main.maxSum(new int[]{1, 10}, new int[]{9999});
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple4() {
        long actual = Main.maxSum(new int[]{2, 10}, new int[]{10,20});
        Assert.assertEquals(168, actual);
    }
    @Test
    public void testSimple5() {
        long actual = Main.maxSum(new int[]{2, 2}, new int[]{1_000_000_000,1_000_000_000});
        Assert.assertEquals(16_000_000_000L, actual);
    }
    @Test
    public void testSimple6() {
        long actual = Main.maxSum(new int[]{2, 4}, new int[]{1_000_000_000,1_000_000_000});
        Assert.assertEquals(17_800_000_000L, actual);
    }
    @Test
    public void testSimple7() {
        long actual = Main.maxSum(new int[]{1, 1}, new int[]{1});
        Assert.assertEquals(8, actual);
    }
    @Test
    public void testSimple8() {
        long actual = Main.maxSum(new int[]{1, 1}, new int[]{1});
        Assert.assertEquals(8, actual);
    }
}
