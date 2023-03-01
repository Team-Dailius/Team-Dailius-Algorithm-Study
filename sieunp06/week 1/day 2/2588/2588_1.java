import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int num1 = stdIn.nextInt();
        String num2 = stdIn.next();
        char[] num2_charArray = num2.toCharArray();

        for (int i = num2.length() - 1; i >= 0; i--) {
          int mul = num1 * (num2_charArray[i] - '0');
          System.out.println(mul);
        }

        System.out.println(num1 * Integer.parseInt(num2));
    }
}