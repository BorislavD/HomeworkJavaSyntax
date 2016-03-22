import java.util.ArrayList;
import java.util.Scanner;

public class Problem13GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInputNumbers = console.nextLine();
        String commands = console.nextLine();
        String[] arguments = commands.split(" ");
        int element = Integer.parseInt(arguments[1]);
        String typeOfNumber = arguments[2];
        String[] userInputSplitted = userInputNumbers.split(" ");
        int[] numbers = new int[userInputSplitted.length];
        for (int i = 0; i < userInputSplitted.length; i++) {
            numbers[i] = Integer.parseInt(userInputSplitted[i]);
        }

        int counter = 1;
        if (typeOfNumber.equals("odd")) {
            for (int i = 0; i < userInputSplitted.length; i++) {
                if ((numbers[i] % 2 != 0) && counter <= element) {
                    System.out.printf("%d ", numbers[i]);
                    counter++;
                }
            }
        }

        if(typeOfNumber.equals("even")){
            for (int i = 0; i < userInputSplitted.length; i++) {
                if ((numbers[i] % 2 == 0) && counter <= element) {
                    System.out.printf("%d ", numbers[i]);
                    counter++;

                }
            }
        }
    }
}

