import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
         return IntStream.rangeClosed(1, String.valueOf(n).length())
             .map(i -> (n / (int)Math.pow(10, i - 1)) % 10)
             .sum();
    }
}