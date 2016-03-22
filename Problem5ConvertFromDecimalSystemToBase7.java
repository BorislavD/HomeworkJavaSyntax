import java.util.Scanner;

public interface Problem5ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String convertedToBase7 = Integer.toString(number, 7);
        System.out.println(convertedToBase7);
    }
}
