import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // Key: 옷 종류, Value: 해당 종류의 옷 리스트
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        // clothes 배열을 순회하며 HashMap에 각 옷의 종류와 이름을 추가한다.
        for (String[] cloth: clothes) {
            // 만약 해당 종류의 옷이 HashMap에 없으면 새로운 ArrayList를 생성해서 추가한다.
            if(!hashMap.containsKey(cloth[1])) {
                hashMap.put(cloth[1],new ArrayList<>());
            }
            // 해당 종류의 옷 리스트에 이름을 추가한다.
            hashMap.get(cloth[1]).add(cloth[0]);
        }
        
        // 각 종류별로 (해당 종류의 옷 개수 + 1)를 곱해서 모든 경우의 수를 계산한다.
        // 각 종류의 옷을 입지 않는 경우도 고려하기 위해 1을 더한다.
        for(ArrayList<String> values: hashMap.values()) {
            answer *= values.size()+1;
        }
        // 모든 옷을 입지 않는 경우의 수 1을 빼서 결과를 반환한다.
        return answer - 1;
    }
}