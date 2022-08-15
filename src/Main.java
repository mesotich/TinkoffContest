import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int n;
    public int[] values;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        main.n = in.nextInt();
        in.nextLine();
        main.values = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(main.sum());
    }

    public int sum() {
        return Arrays.stream(values).sum() - sumDiscount(0, new ArrayList<>(), 0);
    }

    public int sumDiscount(int i, List<Integer> maxValues, int maxSum) {
        List<Integer> newMaxValues = null;
        while (i < n) {
            if (values[i] >= 100) {
                newMaxValues = new ArrayList<>(maxValues);
                newMaxValues.add(0);
                maxSum = sumDiscount(i + 1, newMaxValues, maxSum);
            }
            maxValues = changeMinValue(maxValues, values[i]);
            i++;
        }
        return Math.max(maxSum, maxValues.stream().mapToInt(Integer::intValue).sum());
    }

    private List<Integer> changeMinValue(List<Integer> maxValues, int forChange) {
        if (maxValues == null || maxValues.size() == 0)
            return maxValues;
        int minInd = 0;
        for (int i = 1; i < maxValues.size(); i++) {
            if (maxValues.get(i) < maxValues.get(minInd))
                minInd = i;
        }
        if (forChange > maxValues.get(minInd))
            maxValues.set(minInd, forChange);
        return maxValues;
    }
}
