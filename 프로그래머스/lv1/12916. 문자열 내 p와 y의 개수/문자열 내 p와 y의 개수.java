class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0 , ycnt = 0;
        String[] arr = s.toLowerCase().split("");

        for(int i = 0; i < arr.length; i++){
            if("p".equals(arr[i])){
                pcnt++;
            }else if("y".equals(arr[i])){
                ycnt++;
            }
        }
        if(pcnt != ycnt){
            return false;
        }
        return true;
    }
}