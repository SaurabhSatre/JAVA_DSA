public class MaxConsecutiveOnesFinder {
    
    // Method to find the maximum number of consecutive 1s in the given array
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;   // To count the current streak of consecutive 1s
        int maxi = 0;  // To keep track of the maximum streak

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;  // Increase count when a 1 is found
                maxi = Math.max(maxi, cnt);// Update the maximum streak if the current streak is higher
            } else {
                cnt = 0;  // Reset count when a 0 is found
            }
        }

        return maxi;  // Return the maximum number of consecutive 1s
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesFinder finder = new MaxConsecutiveOnesFinder();
        
        // Test case
        int[] nums = {1, 1, 0, 1, 1, 1,0,1,0,1,1};
        
        // Call the method and print the result
        int result = finder.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive 1s is: " + result);
    }
}
