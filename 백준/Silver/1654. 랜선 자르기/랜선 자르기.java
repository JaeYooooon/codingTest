import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] arr = new long[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long left = 1;
        long right = arr[k - 1];
        long res = 0;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long cnt = 0;
            for(int i = 0; i < k; i++){
                cnt += arr[i] / mid;
            }
            if(cnt >= n){
                res = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(res);
    }
}