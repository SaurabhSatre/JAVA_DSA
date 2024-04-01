import java.util.*;
public class average {

        int a,b,c;

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values 3 to calculate average : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a + b + c / 3;
            System.out.println("average of : "+sum);

              
        }

    }