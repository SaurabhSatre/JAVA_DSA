import java.util.Arrays;

public class Solve {
    public static void main(String[] args) {
        int a[] = {2, 3, 4};
        int b[] = {5, 6, 7};
        int N = a.length;
        int c[] = new int[a.length + b.length]; // Correctly declare the array size

        // Copy elements from the first array into c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        // Copy elements from the second array into c
        for (int j = 0; j < b.length; j++) {
            c[N] = b[j];
            N++; // Increment N to avoid overwriting elements
        }

        // Print the merged array
        System.out.println(Arrays.toString(c));
    }
}
