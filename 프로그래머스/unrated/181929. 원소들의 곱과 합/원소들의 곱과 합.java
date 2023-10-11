import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int product = Arrays.stream(num_list).reduce(1, (x, y) -> x * y); 
        int sum = Arrays.stream(num_list).sum();
        int squareSum = sum * sum; 

        return product < squareSum ? 1 : 0;
    }
}
