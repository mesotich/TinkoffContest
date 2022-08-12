import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] first = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int third = in.nextInt();
        System.out.println(minFlight(first, second, third));
    }

    public static int minFlight(int[] first, int[] second, int third) {
        int fastIndex = third - 1;
        int len = first[0] - 1;
        if (second[fastIndex] - second[0] <= first[1])
            return second[len] - second[0];
        int down = second[fastIndex] - second[0];
        int up = second[len] - second[fastIndex];
        return down < up ? 2 * down + up : 2 * up + down;
    }
}
