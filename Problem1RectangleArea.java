import java.util.Scanner;

public class Problem1RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sideA = console.nextInt();
        int sideb = console.nextInt();
        int result = sideA * sideb;
        System.out.println(result);
    }
}
