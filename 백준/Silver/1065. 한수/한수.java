import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0; 
        for (int i = 1; i <= n; i++) {
            if (isHansu(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isHansu(int num) {
        if (num < 100) { 
            return true;
        } else {
            int d = num % 10 - (num / 10) % 10; 
            while (num >= 10) {
                int temp = num % 10;
                num /= 10;
                if (num % 10 + d != temp) { 
                    return false;
                }
            }
            return true;
        }
    }
}