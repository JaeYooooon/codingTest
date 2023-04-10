
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[N - 1];
        int[] arr2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        long minPrice = arr2[0]; // 최소 기름 가격
        long cost = 0; // 총 비용
        for (int i = 0; i < N - 1; i++) {
            if (arr2[i] < minPrice) {
                minPrice = arr2[i];
            }
            cost += minPrice * arr1[i];
        }

        System.out.println(cost);

    }
}
