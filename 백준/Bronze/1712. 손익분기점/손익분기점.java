import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();	// 고정
        int B = sc.nextInt();	// 가변
        int C = sc.nextInt(); 	// 가격

        if (C <= B) {
            System.out.println("-1");
        }
        else {
            System.out.println((A / (C - B)) + 1);
        }
    }
}
 