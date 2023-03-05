import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int H = stdIn.nextInt();
        int M = stdIn.nextInt();

        if (M - 45 < 0) {
            H -= 1;
            M += 15;
            if (H < 0) {
                H = 23;
            }
        }
        else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}