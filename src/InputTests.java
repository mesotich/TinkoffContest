import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class InputTests {

    @Test
    public void testInput1() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0)
                sb.append(1_000_000_000);
            else sb.append(1_000_000_000-1);
            sb.append(" ");
        }
        String actual = Main.oddEven(1000, prepareScanner(sb));
        Assert.assertEquals("-1 -1", actual);
    }

    @Test
    public void testInput2() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 998; i++) {
            if (i % 2 != 0)
                sb.append(1_000_000_000);
            else sb.append(1_000_000_000-1);
            sb.append(" ");
        }
        sb.append(1_000_000_000).append(" ");
        sb.append(1_000_000_000-1).append(" ");
        String actual = Main.oddEven(1000, prepareScanner(sb));
        Assert.assertEquals("999 1000", actual);
    }

    private int[] prepareScanner(StringBuilder sb) {
        String s = sb.toString().strip();
//        System.out.println(System.in);
        System.setIn(new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8)));
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
