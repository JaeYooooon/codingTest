import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위한 BufferedReader 객체 생성
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백을 기준으로 입력값을 분리하기 위한 StringTokenizer 객체 생성
        StringBuilder sb = new StringBuilder(); // 결과값을 저장하기 위한 StringBuilder 객체 생성

        int n = Integer.parseInt(st.nextToken()); // 사람 수 입력
        int k = Integer.parseInt(st.nextToken()); // 제거할 사람의 인덱스 입력

        LinkedList<Integer> list = new LinkedList<>(); // 사람들의 번호를 저장할 LinkedList 객체 생성

        // 1부터 n까지의 번호를 LinkedList에 추가
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0; // 제거할 사람의 인덱스를 저장할 변수 초기화

        // LinkedList에서 모든 사람을 제거할 때까지 반복
        while (!list.isEmpty()) {
            index += k - 1; // 다음에 제거할 사람의 인덱스 계산
            index %= list.size(); // LinkedList의 크기를 넘어가면 다시 처음부터 시작하도록 인덱스 조정

            sb.append(list.remove(index)).append(", "); // 제거할 사람의 번호를 StringBuilder에 추가하고, LinkedList에서 제거
        }

        sb.setLength(sb.length() - 2); // 마지막 쉼표와 공백 제거
        System.out.println("<" + sb + ">");
    }
}