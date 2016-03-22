import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int M = console.nextInt();

        Random rnd = new Random();

        if(M >= N){
            for (int i = N; i <= M; i++) {
                int result = rnd.nextInt(M - N + 1) + N;
                System.out.printf("%d ", result);
            }
        }
        else{
            for (int i = M; i <= N; i++) {
                int result = rnd.nextInt(N - M + 1) + M;
                System.out.printf("%d ", result);
            }
        }
    }
}
