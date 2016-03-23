import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]+[A-Za-z]*[A-Z]+\\b");
        Matcher matcher = pattern.matcher(userInput);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

    }
}

