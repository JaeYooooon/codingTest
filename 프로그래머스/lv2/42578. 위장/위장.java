import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] row: clothes){
            map.put(row[1], map.getOrDefault(row[1], 0) + 1);
        }
        
        for(String key: map.keySet()){
            answer *= (map.get(key) + 1);
        }
        
        return answer - 1;
    }
}