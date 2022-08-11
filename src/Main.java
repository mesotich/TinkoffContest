import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((int) Math.ceil(Math.log(in.nextInt()) / Math.log(2)));
    }
}
