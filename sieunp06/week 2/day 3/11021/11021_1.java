import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int T = stdIn.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int A = stdIn.nextInt();
            int B = stdIn.nextInt();
            
            System.out.println("Case #" + i + ": " + (A + B));
        }
    }
}