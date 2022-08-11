import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (data[3] <= data[1]) System.out.println(data[0]);
        else System.out.println(data[0] + (data[3] - data[1]) * data[2]);
    }
}
