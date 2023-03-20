import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        // 문자열 배열을 정렬
        Arrays.sort(phone_book);
        // 인접한 두 문자열을 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                // 다음 문자열이 현재 문자열의 접두어인 경우 false
                return false;
            }
        }

        // 접두어가 없는 경우 true
        return true;
    }
}