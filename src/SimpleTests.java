import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTests {

    private Main main;

    @Before
    public void main() {
        main = new Main();
    }

    @Test
    public void testSimple1() {
        main.n = 5;
        main.values = new int[]{35, 40, 101, 59, 63};
        int actual = main.sum();
        Assert.assertEquals(235, actual);
    }

    @Test
    public void testSimple2() {
        main.n = 5;
        main.values = new int[]{35, 40, 99, 59, 63};
        int actual = main.sum();
        Assert.assertEquals(296, actual);
    }

    @Test
    public void testSimple3() {
        main.n = 6;
        main.values = new int[]{101, 1, 2, 102, 1, 2};
        int actual = main.sum();
        Assert.assertEquals(107, actual);
    }

    @Test
    public void testSimple4() {
        main.n = 4;
        main.values = new int[]{101, 1, 102, 1};
        int actual = main.sum();
        Assert.assertEquals(103, actual);
    }
    @Test
    public void testSimple5() {
        main.n = 4;
        main.values = new int[]{101, 1, 102, 123};
        int actual = main.sum();
        Assert.assertEquals(203, actual);
    }
}
