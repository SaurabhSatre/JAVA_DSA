import java.util.*;
public class function2 {
    public static void addition(int num1,int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : "+sum);

    }
    public static void main(String arg[]) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            addition(a, b);
    }
    
}
