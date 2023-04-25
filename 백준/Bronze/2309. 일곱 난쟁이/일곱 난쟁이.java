import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights[i] - heights[j] == 100) { 
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) continue; 
                        System.out.println(heights[k]);
                    }
                    return; 
                }
            }
        }
    }
}