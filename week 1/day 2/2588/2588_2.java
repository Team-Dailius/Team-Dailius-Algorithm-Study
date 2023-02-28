import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(bf.readLine());
        String num2 = bf.readLine();
        char[] num2_charArray = num2.toCharArray();

        for (int i = num2.length() - 1; i >= 0; i--) {
          int mul = num1 * (num2_charArray[i] - '0');
          sb.append(mul).append('\n');
        }

        sb.append(num1 * Integer.parseInt(num2));
        System.out.println(sb);
    }
}