import java.util.Scanner;

public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();
        String aConvertedToHex = Integer.toHexString(a);
        String aConvertedToBinary = Integer.toBinaryString(a);
        int aConvertedToBinaryAsInt = Integer.parseInt(aConvertedToBinary);
        String result = String.format("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", aConvertedToHex, aConvertedToBinaryAsInt, b, c);
        System.out.println(result);
    }
}
