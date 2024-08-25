import java.util.List;

public class PaintColors {
    
    public static int getMaxColors(List<Integer> prices, int money) {
        int left = 0;
        int currentSum = 0;
        int maxColors = 0;
        
        for (int right = 0; right < prices.size(); right++) {
            currentSum += prices.get(right);
            
            while (currentSum > money && left <= right) {
                currentSum -= prices.get(left);
                left++;
            }
            
            maxColors = Math.max(maxColors, right - left + 1);
        }
        
        return maxColors;
    }
    
    public static void main(String[] args) {
        List<Integer> prices = List.of(2, 3, 5, 1, 1, 2, 1);
        int money = 7;
        
        int maxColors = getMaxColors(prices, money);
        System.out.println("Maximum number of colors: " + maxColors);
    }
}
