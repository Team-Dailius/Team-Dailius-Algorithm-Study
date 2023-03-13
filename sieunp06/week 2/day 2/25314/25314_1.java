import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        n -= 4;
        
        while (n > 0) {
            System.out.print("long ");
            n -= 4;
        }
        System.out.print("long int");
    }
}