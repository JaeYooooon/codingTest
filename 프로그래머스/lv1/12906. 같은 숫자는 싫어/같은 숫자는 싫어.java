import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int j = 0;
        for(int i= 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1])
                j++;
        }
        int[] answer = new int[j+1];
        j = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                answer[j] = arr[i];
                j++;
            }
        }
        answer[j] = arr[arr.length-1];
        return answer;
    }
}