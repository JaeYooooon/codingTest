import java.util.*;


class Solution {
    public int[] solution(int n) {
        int cnt = 0;

        if(n % 2 == 0) cnt = n/2;
        else cnt = n/2 + 1;

        int[] result = new int[cnt];
        int num = 1;

        for(int i=0; i<result.length; i++){
            result[i] = num;
            num = num + 2;
        }

        return result;
    }
}

