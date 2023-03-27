import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        while (true) {
            String str = sc.nextLine();
            if (str.equals("="))
                break;
            switch (str) {
                case "+":
                    sum += sc.nextInt();
                    break;
                case "-":
                    sum -= sc.nextInt();
                    break;
                case "*":
                    sum *= sc.nextInt();
                    break;
                case "/":
                    sum /= sc.nextInt();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}