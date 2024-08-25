import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    
    public static void closestNumbers(List<Integer> numbers) {
        // Step 1: Sort the list
        Collections.sort(numbers);
        
        // Step 2: Find the minimum absolute difference
        int minDiff = Integer.MAX_VALUE;
        List<int[]> resultPairs = new ArrayList<>();
        
        for (int i = 0; i < numbers.size() - 1; i++) {
            int num1 = numbers.get(i);
            int num2 = numbers.get(i + 1);
            int diff = num2 - num1;
            
            if (diff < minDiff) {
                minDiff = diff;
                resultPairs.clear();
                resultPairs.add(new int[]{num1, num2});
            } else if (diff == minDiff) {
                resultPairs.add(new int[]{num1, num2});
            }
        }
        
        // Step 3: Print the pairs with minimum difference in ascending order
        for (int[] pair : resultPairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        
        closestNumbers(numbers);
    }
}
