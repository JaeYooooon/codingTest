class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] s = letter.split(" ");
        String[] t = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(int i=0;i<s.length;i++){
            for(int j=0;j<t.length;j++){
                if(s[i].equals(t[j])) answer+=(char)('a'+j);
            }
        }

        return answer;
    }
}