import java.util.Scanner;

public class Problem9HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if((i + j) == n){
                    System.out.printf("%d + %d = %d", i, j, i+j);
                    System.out.println();
                }
                if((i - j) == n){
                    System.out.printf("%d - %d = %d", i, j, i-j);
                    System.out.println();
                }
                if((j - i) == n){
                    System.out.printf("%d - %d = %d", j, i, j-i);
                    System.out.println();
                }

            }
        }
    }
}
