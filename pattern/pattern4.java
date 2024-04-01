
import java.util.*;
public class pattern4 {
    public static void main(String args[]){
        System.out.println("Enter number of line : ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        char ch='A';

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
                 System.out.println();
        }
    }
}


