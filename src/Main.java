import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] row = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(oddEven(n, row));
    }

    public static String oddEven(int n, int[] row) {
        int oddInd = -1;
        int evenInd = -1;
        int val;
        int place;
        for (int i = 0; i < n; i++) {
            val = row[i] % 2;
            place = i % 2;
            if ((val == 1 && place == 0) || (val == 0 && place == 1))
                continue;
            if (val == 0) {
                if (oddInd != -1) return "-1 -1";
                else oddInd = i + 1;
            } else {
                if (evenInd != -1) return "-1 -1";
                else evenInd = i + 1;
            }
        }
        if (oddInd == -1 || evenInd == -1) return "-1 -1";
        return oddInd < evenInd ? oddInd + " " + evenInd : evenInd + " " + oddInd;
    }
}
