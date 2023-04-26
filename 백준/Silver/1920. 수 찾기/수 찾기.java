import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt(); 
            int result = binarySearch(A, x); 
            System.out.println(result);
        }
    }
    public static int binarySearch(int[] A, int x){
        int left = 0;
        int right = A.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(A[mid] == x){
                return 1;
            }else if (A[mid] > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return 0;
    }
}