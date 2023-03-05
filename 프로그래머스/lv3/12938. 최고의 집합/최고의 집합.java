class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];

        int cnt = n;
        for(int i=0; i<n; i++) {
            answer[i] = s/cnt;
            s -= s/cnt;
            cnt--;
        }

        if(answer[0]==0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}