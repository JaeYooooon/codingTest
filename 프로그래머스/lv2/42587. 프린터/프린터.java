import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0; // 인쇄한 문서 수
        Queue<Integer> queue = new LinkedList<>(); // 대기열을 구현하기 위한 Queue
        for (int priority : priorities) { // 대기열 초기화
            queue.add(priority);
        }
        Arrays.sort(priorities); // 우선순위 배열을 오름차순으로 정렬

        int index = priorities.length - 1; // 우선순위 배열에서 가장 높은 우선순위의 인덱스
        while (!queue.isEmpty()) { // 모든 문서가 인쇄될 때까지 반복
            int priority = queue.poll(); // 대기열에서 맨 앞의 문서를 꺼냄
            if (priority == priorities[index]) { // 현재 문서의 우선순위가 가장 높은 경우
                index--; // 다음으로 가장 높은 우선순위를 가진 문서를 찾기 위해 index를 감소시킴
                answer++; // 인쇄한 문서 수 증가
                if (location == 0) { // 요청한 문서를 인쇄한 경우
                    break; // 반복문을 빠져나감
                } else { // 요청한 문서가 아닌 경우
                    location--; // 다음에 처리할 요청한 문서의 위치를 하나 감소시킴
                }
            } else { // 현재 문서의 우선순위가 가장 높은 것이 아닌 경우
                queue.add(priority); // 대기열의 맨 뒤로 다시 추가함
                if (location == 0) { // 요청한 문서의 위치인 경우
                    location = queue.size() - 1; // 다음에 처리할 요청한 문서의 위치를 대기열의 마지막으로 설정함
                } else { // 요청한 문서가 아닌 경우
                    location--; // 다음에 처리할 요청한 문서의 위치를 하나 감소시킴
                }
            }
        }

        return answer; // 인쇄한 문서 수 반환
    }
}