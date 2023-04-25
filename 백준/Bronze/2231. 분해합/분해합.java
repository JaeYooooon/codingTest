import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int sum = i;
            int num = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}