import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int total = Integer.parseInt(bf.readLine());
        int T = Integer.parseInt(bf.readLine());
        int answer = 0;
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            answer += price * num;
        }
        
        if (answer == total) System.out.println("Yes");
        else System.out.println("No");
    }
}