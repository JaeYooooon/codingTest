import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] nums = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }
        // 자리수가 작은 것을 기준으로 정렬
        Arrays.sort(nums);
        for (int i = 0; i < 63; i++) { // 최대 63비트
            long cnt = 0;
            for (int j = 0; j < n; j++) {
                if ((nums[j] & (1L << i)) != 0) { // i번째 자리가 1인 경우
                    cnt++;
                }
            }
            ans += (cnt * (n - cnt) * (1L << i));
        }
        System.out.println(ans);
    }
}