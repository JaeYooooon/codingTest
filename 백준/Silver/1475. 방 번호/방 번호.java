import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomNumber = scanner.next();
        
        int[] digitCount = new int[10]; 
        
        for (int i = 0; i < roomNumber.length(); i++) {
            int digit = Character.getNumericValue(roomNumber.charAt(i));
            digitCount[digit]++;
        }
        
        int sixOrNineCount = (digitCount[6] + digitCount[9] + 1) / 2;
        int maxCount = 0;
        
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                maxCount = Math.max(maxCount, digitCount[i]);
            }
        }
        
        int totalSets = Math.max(sixOrNineCount, maxCount);
        
        System.out.println(totalSets);
    }
}
