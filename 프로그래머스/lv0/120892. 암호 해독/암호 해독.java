class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] s = cipher.split("");
        
        for(int i = 0; i < s.length; i++){
            if((i + 1) % code == 0){
                answer += s[i];
            }
        }
        
        return answer;
    }
}