import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String[] cloth : clothes){
            if(!map.containsKey(cloth[1])){
                map.put(cloth[1], new ArrayList<>());
            }
            map.get(cloth[1]).add(cloth[0]);
        }
        for(ArrayList<String> value : map.values()){
            answer *= value.size() + 1;
        }
        return answer - 1;
    }
}
