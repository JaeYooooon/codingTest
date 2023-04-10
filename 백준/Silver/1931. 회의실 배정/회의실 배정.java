
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (x1, x2) -> {
            if(x1[1] == x2[1]) { 
                return x1[0] - x2[0];
            }
            return x1[1] - x2[1];
        });
        int cnt = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            if(end <= arr[i][0]){
                end = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


