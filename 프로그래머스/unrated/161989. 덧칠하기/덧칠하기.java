class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        int o = section[0];
        while(idx < section.length){
            if(o <= section[idx]){
                o = section[idx] + m;
                answer++;
            }
            idx++;
        }
        return answer;
    }
}