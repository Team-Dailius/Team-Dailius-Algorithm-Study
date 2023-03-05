import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int H = stdIn.nextInt();
        int M = stdIn.nextInt();

        M += stdIn.nextInt();

        while (M >= 60) {
            H++;
            M -= 60;

            if (H >= 24) 
                H -= 24;
        }
        
        System.out.println(H + " " + M);
    }
}