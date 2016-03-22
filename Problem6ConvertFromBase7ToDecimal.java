import java.util.Scanner;

public class Problem6ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        int result = Integer.parseInt(number, 7);
        System.out.println(result);
    }
}
