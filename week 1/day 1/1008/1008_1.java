import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        double A = stdIn.nextDouble();
        double B = stdIn.nextDouble();
        
        System.out.println(A / B);
    }
}