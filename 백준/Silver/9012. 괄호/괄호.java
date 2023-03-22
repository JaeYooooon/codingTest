import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            sb.append(solution(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
    public static String solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push('(');
            else if(stack.isEmpty()) return "NO";
            else stack.pop();
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}