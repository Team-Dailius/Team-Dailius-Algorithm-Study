import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int total = stdIn.nextInt();
        
        int T = stdIn.nextInt();
        
        int answer = 0;
        
        for (int i = 0; i < T; i++) {
            int price = stdIn.nextInt();
            int num = stdIn.nextInt();
            answer += price * num;
        }
        
        if (answer == total) System.out.println("Yes");
        else System.out.println("No");
    }
}