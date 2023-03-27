import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                list.add(String.valueOf(key));
            }
        }
        return list.stream().sorted().collect(Collectors.joining());
    }
}