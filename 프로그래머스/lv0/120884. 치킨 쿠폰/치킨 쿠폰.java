class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10){
            int service = chicken / 10;
            int nmg = chicken %  10;

            chicken = service + nmg;

            answer += service;

        }


        return answer;
    }
}
