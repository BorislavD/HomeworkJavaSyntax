import java.util.Scanner;

public class Problem8OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] userInputSplitted = userInput.split(" ");
        int[] numbers = new int[userInputSplitted.length];
        for (int i = 0; i < userInputSplitted.length; i++) {
            numbers[i] = Integer.parseInt(userInputSplitted[i]);
        }

        if (userInputSplitted.length % 2 != 0) {
            System.out.println("Invalid length");

        } else {
            for (int i = 0; i < userInputSplitted.length - 1; i += 2) {
                if ((numbers[i] + numbers[i + 1]) % 2 != 0) {
                    System.out.printf("%d, %d -> different\n", numbers[i], numbers[i + 1]);
                    // "%d, %d -> different\n", a, b
                } else if (numbers[i] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n", numbers[i], numbers[i + 1]);
                } else {
                    System.out.printf("%d, %d -> different\n", numbers[i], numbers[i + 1]);

                }
            }
        }
    }
}


