import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    long[] arr = new long[N + 1];

    for (int i = 1; i <= N; i++) {
      arr[i] = arr[i - 1] + scanner.nextInt();
    }

    for (int q = 0; q < M; q++) {
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      System.out.println(arr[j] - arr[i - 1]);
    }

    scanner.close();
  }
}
