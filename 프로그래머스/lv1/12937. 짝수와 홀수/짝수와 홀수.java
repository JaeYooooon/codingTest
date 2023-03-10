import java.util.stream.*;

public class Solution {
    public String solution(int num) {
        return IntStream.of(num)
                .mapToObj(n -> n % 2 == 0 ? "Even" : "Odd")
                .findFirst()
                .orElse("");
    }
}