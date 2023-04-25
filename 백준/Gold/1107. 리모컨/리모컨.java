import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();
        boolean[] broken = new boolean[10];
        for(int i = 0; i  < n; i++){
            int m = sc.nextInt();
            broken[m] = true;
        }
        int res = Math.abs(target - 100);
        for(int i = 0; i <= 999999; i++){
            String s = String.valueOf(i);
            int len = s.length();
            boolean isBroken = false;
            for(int j = 0; j < s.length(); j++){
                if(broken[s.charAt(j) - '0']){
                    isBroken = true;
                    break;
                }
            }
            if(!isBroken){
                int min = Math.abs(target - i) + len;
                res = Math.min(min, res);
            }
        }
        System.out.println(res);
    }
}