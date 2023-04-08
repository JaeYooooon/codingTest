
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int p1 = 0;
        int p2 = 0;
        int cnt = 0;
        int sum = 0;
        while (p2 <= N) {
            if (sum == M) {
                cnt++;
            }
            // 합이 M 이상이면 left 포인터를 오른쪽으로 이동
            if (sum > M) {
                sum -= arr[p1++];
            }
            // 합이 M 미만이면 right 포인터를 오른쪽으로 이동
            else if (p2 == N) {
                break;
            } else {
                sum += arr[p2++];
            }
        }
        System.out.println(cnt);
    }
}
