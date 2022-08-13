import org.junit.Assert;
import org.junit.Test;

public class SimpleTests {

    @Test
    public void testSimple1() {
        long actual = Main.testQuantity(4, 7);
        Assert.assertEquals(4, actual);
    }

    @Test
    public void testSimple2() {
        long actual = Main.testQuantity(10, 100);
        Assert.assertEquals(9, actual);
    }
    @Test
    public void testSimple3() {
        long actual = Main.testQuantity(164, 1147);
        Assert.assertEquals(9, actual);
    }
    @Test
    public void testSimple4() {
        long actual = Main.testQuantity(1, 1_000_000_000_000_000_000L);
        Assert.assertEquals(162, actual);
    }
    @Test
    public void testSimple5() {
        long actual = Main.testQuantity(2, 2);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testSimple6() {
        long actual = Main.testQuantity(23, 23);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void testSimple7() {
        long actual = Main.testQuantity(777, 777);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testSimple8() {
        long actual = Main.testQuantity(776, 777);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testSimple9() {
        long actual = Main.testQuantity(777, 778);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testSimple10() {
        long actual = Main.testQuantity(9, 10);
        Assert.assertEquals(1, actual);
    }
    @Test
    public void testSimple11() {
        long actual = Main.testQuantity(23, 24);
        Assert.assertEquals(0, actual);
    }



}
