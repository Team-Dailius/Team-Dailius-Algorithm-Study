import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num1 = stdIn.nextInt();
        int num2 = stdIn.nextInt();

        if (num1 < num2) 
          System.out.println("<");
        else if (num1 == num2)
          System.out.println("==");
        else 
          System.out.println(">");
    }
}