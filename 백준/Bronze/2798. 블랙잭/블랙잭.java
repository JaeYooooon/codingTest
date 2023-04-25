import java.util.*;

public class Main {
    static int search(int[] arr, int N, int M){
        int res = 0;
        for(int i = 0; i < N - 2; i++){
            if(arr[i] > M) continue;
            for(int j = i + 1; j < N - 1; j++){
                if(arr[i] + arr[j] > M) continue;
                for(int k = j + 1; k < N; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(M == temp) return temp;
                    if(res < temp && temp < M){
                        res = temp;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }
}