import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant){
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
        }
        for(String c : completion){
            if(map.containsKey(c)){
                int cnt = map.get(c);
                if(cnt == 1){
                    map.remove(c);
                }else{
                    map.put(c, cnt - 1);
                }
            }
        }
        answer = "";
        for(String o : map.keySet()){
            answer += o;
        }
        return answer;
    }
}