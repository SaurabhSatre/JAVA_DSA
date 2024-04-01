// using function addtion and multiplication
import java.util.*;
public class funtion3 {
    
    public static int addition(int num1,int num2) {
        int sum = num1 + num2;
        return sum;   
    }

    public static int multiply(int n1,int n2) {
        int product = n1 * n2;
        return product; 
    }
    public static void main(String arg[]) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

           int sum = addition(a, b);
            System.out.println("Sum is : "+sum);
            int c=6,d=9;

            int product = multiply(c, d);
            System.out.println("the first product : "+product);
            product = multiply(10, 20);
            System.out.println("the second product : "+product);

    }
    
}
