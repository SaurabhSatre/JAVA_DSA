import java.util.*;

public class Missing_number {
    public static int missingNumber(int[] arr, int N) {

        for (int i = 1; i < N; i++) {
            boolean flag = false;
            for (int j = 0; j < N-1; j++) {
                if(arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return i;
            }  
        }
            
            return -1;
    
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}