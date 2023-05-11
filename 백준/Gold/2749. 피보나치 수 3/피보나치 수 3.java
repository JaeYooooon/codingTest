import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pisano = 1500000;
        long n = sc.nextLong() % pisano;  
        long[] arr = new long[pisano];
        
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < pisano; i++){
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000;
        }
        System.out.println(arr[(int)n]);
    }
}
