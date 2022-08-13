import org.junit.Assert;
import org.junit.Test;

public class SimpleTests {

    @Test
    public void testSimple1() {
        String actual = Main.oddEven(4, new int[]{2,1,4,6});
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testSimple2() {
        String actual = Main.oddEven(2, new int[]{1,2});
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testSimple3() {
        String actual = Main.oddEven(2, new int[]{2,1});
        Assert.assertEquals("1 2", actual);
    }
    @Test
    public void testSimple4() {
        String actual = Main.oddEven(2, new int[]{1,1});
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testSimple5() {
        String actual = Main.oddEven(5, new int[]{1,2,5,1,3});
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testSimple6() {
        String actual = Main.oddEven(5, new int[]{1,2,5,1,4});
        Assert.assertEquals("4 5", actual);
    }
    @Test
    public void testSimple7() {
        String actual = Main.oddEven(5, new int[]{1,2,3,4,5});
        Assert.assertEquals("-1 -1", actual);
    }
    @Test
    public void testSimple8() {
        String actual = Main.oddEven(6, new int[]{1,2,5,2,4,3});
        Assert.assertEquals("5 6", actual);
    }
    @Test
    public void testSimple9() {
        String actual = Main.oddEven(6, new int[]{1,2,5,2,4,3,7});
        Assert.assertEquals("5 6", actual);
    }

}
