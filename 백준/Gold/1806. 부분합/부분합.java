import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(true){
            if(sum >= S){
                sum -= arr[p1];
                res = Math.min(p2 - p1, res);
                p1++;
            }else if(p2 == N){
                break;
            }else{
                sum += arr[p2++];
            }
        }
        if(res == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(res);
    }
}