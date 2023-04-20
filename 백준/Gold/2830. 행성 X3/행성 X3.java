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
        Arrays.sort(nums);
        for (int i = 0; i < 63; i++) { 
            long cnt = 0;
            for (int j = 0; j < n; j++) {
                if ((nums[j] & (1L << i)) != 0) { 
                    cnt++;
                }
            }
            ans += (cnt * (n - cnt) * (1L << i));
        }
        
        System.out.println(ans);
        
    }
}
