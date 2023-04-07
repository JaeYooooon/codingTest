import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 필요한 나무 길이

        int[] tree = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree);
        int left = 0;
        int right = tree[tree.length - 1];
        while(left <= right){
            int mid = left + (right - left) / 2;
            long sum = 0;
            for(int h : tree){
                if(h - mid > 0){
                    sum += h - mid;
                }
            }
            if(sum < M){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(right);
    }
}