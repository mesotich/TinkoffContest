import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(testQuantity(in.nextLong(), in.nextLong()));
    }

    public static int testQuantity(long start, long finish) {
        String startString = String.valueOf(start);
        String finishString = String.valueOf(finish);
        int startLen = startString.length();
        int finishLen = finishString.length();
        int startBorder = borderQuantity(startString, true);
        int finishBorder = borderQuantity(finishString, false);
        if (startLen == finishLen) {
            return finishBorder - startBorder + 1;
        }
        return (finishLen - startLen - 1) * 9 +
                10 - startBorder +
                finishBorder;
    }

    private static int borderQuantity(String border, boolean isStart) {
        int a = Integer.parseInt(String.valueOf(border.charAt(0)));
        int b = isStart ? 0 : 10;
        for (int i = 1; i < border.length(); i++) {
            b = Integer.parseInt(String.valueOf(border.charAt(i)));
            if (a != b) break;
        }
        return isStart ?
                a >= b ? a : a + 1 :
                a > b ? a - 1 : a;
    }
}
