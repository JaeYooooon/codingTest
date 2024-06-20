import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        if(N == number) return 1;
        
        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            dp.add(new HashSet<>());
        }

        dp.get(1).add(N);

        for (int i = 2; i < 9; i++) {
            Set<Integer> currentSet = dp.get(i);
            for (int j = 1; j < i; j++) {
                Set<Integer> set1 = dp.get(j);
                Set<Integer> set2 = dp.get(i - j);
                
                for (int num1 : set1) {
                    for (int num2 : set2) {
                        currentSet.add(num1 + num2);
                        currentSet.add(num1 - num2);
                        currentSet.add(num1 * num2);
                        if (num2 != 0) {
                            currentSet.add(num1 / num2);
                        }
                    }
                }
            }
            currentSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));

            if (currentSet.contains(number))  return i;
        }
        
        return -1;
    }
}