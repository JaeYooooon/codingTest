import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<>();
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());	// 큐의 크기
        int M = Integer.parseInt(st.nextToken());	// 뽑으려는 숫자의 개수
        IntStream.rangeClosed(1, N).forEach(x -> deque.add(x));
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[M];	// 뽑고자 하는 수를 담은 배열
        for(int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int idx = 0;	// 뽑아내려는 원소의 인덱스
        while(idx < M) {
            int num = arr[idx];	// 뽑아내려는 원소
            int pos = deque.indexOf(num);	// 뽑아내려는 원소의 현재 위치
            int size = deque.size();

            if(pos == 0) {	// 현재 가장 앞에 있는 숫자를 뽑아내는 경우
                deque.pollFirst();
                idx++;
            } else if(pos <= size / 2) {	// 뽑으려는 숫자가 현재 앞쪽에 있는 경우
                deque.offerLast(deque.pollFirst());
                cnt++;
            } else {	// 뽑으려는 숫자가 현재 뒤쪽에 있는 경우
                deque.offerFirst(deque.pollLast());
                cnt++;
            }
        }
        System.out.println(cnt);



    }
}
