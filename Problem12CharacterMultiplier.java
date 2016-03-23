import java.util.Scanner;

public class Problem12CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split(" ");
        String firstString = arr[0];
        String secondString = arr[1];

        int sum = 0;
        int multiplicationEqual = 1;

        if(firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                multiplicationEqual = firstString.charAt(i)*secondString.charAt(i);
                sum += multiplicationEqual;
            }
        }

        if(firstString.length() < secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                multiplicationEqual = firstString.charAt(i)*secondString.charAt(i);
                sum += multiplicationEqual;
            }
            String newString1 = secondString.substring(firstString.length());
            for (int i = 0; i <newString1.length(); i++) {
                sum += newString1.charAt(i);
            }
        }

        if(firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length(); i++) {
                multiplicationEqual = firstString.charAt(i)*secondString.charAt(i);
                sum += multiplicationEqual;
            }
            String newString2 = firstString.substring(secondString.length());
            for (int i = 0; i <newString2.length(); i++) {
                sum += newString2.charAt(i);
            }
        }
        System.out.println(sum);
    }

}
