import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] first = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxSum(first, second));
    }

    public static long maxSum(int[] first, int[] second) {
        long sum = 0L;
        List<List<Integer>> list = new ArrayList<>();
        for (int x : second
        ) {
            int count = 0;
            List<Integer> l;
            do {
                try {
                    l = list.get(count);
                } catch (IndexOutOfBoundsException e) {
                    l = new ArrayList<>();
                    list.add(l);
                }
                l.add(x % 10);
                count++;
                x /= 10;
            }
            while (x != 0);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            List<Integer> l = list.get(i);
            Collections.sort(l);
            for (int n : l
            ) {
                if (first[1] == 0)
                    return sum;
                sum += (9 - n) * Math.pow(10, i);
                first[1] -= 1;
            }
        }
        return sum;
    }
}
