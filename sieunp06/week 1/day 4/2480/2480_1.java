import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num1 = stdIn.nextInt();
        int num2 = stdIn.nextInt();
        int num3 = stdIn.nextInt();

        if (num1 == num2 && num2 == num3 && num1 == num3)   // 3개의 숫자가 모두 같을 때
            System.out.println(10000 + num1 * 1000);
        else if (num1 != num2 && num2 != num3 && num1 != num3) {    // 3개의 숫자가 모두 다를 때
            int max;
			if (num1 > num2) {
				if (num3 > num1) 
					max = num3;
				else max = num1;
			}	
			else {
				if (num3 > num2) 
					max = num3;
				else max = num2;
            }
            System.out.println(max * 100);
        } else {    // 2개의 숫자는 같고, 1개의 숫자는 다를 때
            if (num1 == num2 || num1 == num3) 
                System.out.println(1000 + num1 * 100);
            else
                System.out.println(1000 + num2 * 100);

        }
    }
}