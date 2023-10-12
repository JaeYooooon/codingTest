import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    List<String> list = new ArrayList<>();
    HashSet<String> uniqueWords = new HashSet<>();

    for (int i = 0; i < N; i++) {
      String word = br.readLine();
      if (!uniqueWords.contains(word)) {
        list.add(word);
        uniqueWords.add(word);
      }
    }

    list.sort((a, b) -> {
      if (a.length() != b.length()) {
        return Integer.compare(a.length(), b.length());
      } else {
        return a.compareTo(b);
      }
    });

    for (String s : list) {
      System.out.println(s);
    }
  }
}